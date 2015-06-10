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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {

	@FXML	private Button loginBtn;
	@FXML	private Button signUpBtn;
	@FXML	private Stage primaryStage;
	@FXML	private Button button;
	
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resource) {

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
		
		
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("StandBy.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}

	public void handlesignUpBtnAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public void setSecondStage(Stage secondStage) {
		
	}
}
