package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import com.my.service.ConnectionDB;

public class RootController implements Initializable {
	@FXML
	private TextField idTxt; // id textField
	@FXML
	private PasswordField pwTxt; // pw textField
	@FXML
	private Label resultLabel; // result Label
	@FXML
	private Button loginBtn;
	@FXML
	private Button signUpBtn;

	private Stage primaryStage;

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	public void initialize(URL location, ResourceBundle resource) {
		resultLabel.setVisible(false);
		signUpBtn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handlesignUpBtnAction(event);
			}
		});

		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleloginBtnAction(event);
			}
		});

	}

	public void handleloginBtnAction(ActionEvent event) {

		String url = "jdbc:oracle:thin:@124.137.8.45:1521:XE";
		String user = "maccao";
		String password = "1q2w3e";
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			String id = idTxt.getText();
			String user_password = pwTxt.getText();

			// ConnectionDB cdb = new ConnectionDB();
			if (!(id.equals("") || password.equals(""))) {
				// 아이디 또는 비밀번호를 입력했을 때
				String selectSQL = "SELECT * FROM users WHERE id='" + id + "'"
						+ " AND U_PW='" + user_password + "'";

				stmt = con.createStatement();
				// stmt = cdb.getCon().createStatement();
				int cnt = stmt.executeUpdate(selectSQL);
				System.out.println("id = " + id + " " + "pw= " + user_password);
				if (cnt == 1) {
					resultLabel.setText("Login 성공");
					System.out.println("login Success");
					showDialog("StandBy.fxml");
				} else {
					resultLabel.setVisible(true);
					resultLabel.setText("ID 또는 Password 오류!");
					// System.out.println("ID 또는 Password 오류");
				}

			} else {// 아이디 또는 비밀번호를 입력하지 않았을 때
				resultLabel.setVisible(true);
				resultLabel.setText("id 또는 비밀번호를 잘못 입력했습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (stmt != null) {
				stmt.close();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void handlesignUpBtnAction(ActionEvent event) {
		showDialog("SignUp.fxml");
		System.out.println("회원가입 버튼 클릭");
	}

	public void showDialog(String fxml) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource(fxml));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
