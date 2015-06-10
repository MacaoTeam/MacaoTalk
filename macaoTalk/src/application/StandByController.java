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

	private Stage secondStage;

	public void setSecondStage(Stage secondStage) {
		this.secondStage = secondStage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resource) {

		roomMakeBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleroomMakeBtnAction(event);
			}
		});
	}

	public void handleroomMakeBtnAction(ActionEvent event) {
		System.out.println("방만들기");
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(secondStage);
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

}
