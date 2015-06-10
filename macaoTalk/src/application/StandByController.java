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

public class StandByController implements Initializable {

	@FXML
	private Button roomMakeBtn;
	@FXML
	private Button roomJoinBtn;
	@FXML
	private Button idSearchBtn;
	@FXML
	private Button userInfoChangeBtn;
	@FXML
	private Stage primaryStage;
	

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;

	}

	@Override
	public void initialize(URL location, ResourceBundle resource) {

		roomMakeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleroomMakeBtnAction(event);
			}
		});

		roomJoinBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleroomJoinBtnAction(event);
			}
		});
		
		idSearchBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleidSearchBtnAction(event);
			}
		});
		
		userInfoChangeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleuserInfoChangeBtnAction(event);
			}
		});
	}

	public void handleroomMakeBtnAction(ActionEvent event) {

		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("makeRoom.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
	}

	public void handleroomJoinBtnAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("chatroom.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void handleidSearchBtnAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("idSearch.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void handleuserInfoChangeBtnAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("ModifySignUp.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}
