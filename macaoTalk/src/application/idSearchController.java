package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;


public class idSearchController implements Initializable {
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
}


	
	
	
	
	
	
	
	
	
/*	@FXML	private Button SearchCheckBtn;
	@FXML	private Stage primaryStage;

	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}

	


	@Override
	public void initialize(URL location, ResourceBundle resource) {
		
		SearchCheckBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
			public void handle(ActionEvent event) {
				handleSearchCheckBtnAction(event);
			}
		});
	}
	
	
	public void handleSearchCheckBtnAction(ActionEvent event) {
		Stage dialog = new Stage(StageStyle.DECORATED);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		Parent parent;
		try {
			parent = FXMLLoader.load(getClass().getResource("idSearch.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			primaryStage.hide();
			dialog.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


*/