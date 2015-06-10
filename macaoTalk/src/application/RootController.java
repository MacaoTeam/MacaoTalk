package application;

import java.io.IOException;
import java.net.URL;
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

		String id = idTxt.getText();
		String password = pwTxt.getText();

		if (id.equals("") || password.equals("")) {
			resultLabel.setVisible(true);
			resultLabel.setText("id 또는 비밀번호를 잘못 입력했습니다.");
		}
		else {
			dialog("StandBy.fxml");
			System.out.println("id = " + id + " " + "pw= " + password);
		}

	}

	public void handlesignUpBtnAction(ActionEvent event) {
		dialog("SignUp.fxml");
		System.out.println("회원가입 버튼 클릭");
	}

	public void dialog(String fxml) {
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
