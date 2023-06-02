package com.application.client.add;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientAddUiController {

	
	
	
	
	
	public ClientAddUiController() {
		  try {
				
				Parent rootForClient = FXMLLoader.load(getClass().getResource("ClientAddUi.fxml"));
				Scene sceneForClient =new Scene(rootForClient);
				
				//sceneForClient.getStylesheets().add(getClass().getResource("ClientAddUi.css").toExternalForm());
			
			Stage stage=new Stage();
			stage.setScene(sceneForClient);
			stage.setTitle("Ajouter Client");
			stage.show();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		  }
}
