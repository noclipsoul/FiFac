package com.application.client;

import com.application.client.add.ClientAddUiController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
public class ClientUiController {
	 
	  @FXML
	  private Button ClientUiAddBtnPopMenu;

	  @FXML
	  void ClientUiAddBtnPopMenuCall(MouseEvent event) {
		  ClientAddUiController CAUC=new ClientAddUiController();
	  }
	  
	  
	  

	  
	  
	  public ClientUiController() {
	
	
		  }
}