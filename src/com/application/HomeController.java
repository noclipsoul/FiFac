package com.application;

import com.application.client.ClientUiController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeController {
	 @FXML
	    private BorderPane Main_App_Main_BorderPan;

	    @FXML
	    private AnchorPane Main_App_Main_AnchorPane;

	    @FXML
	    private MenuBar Main_App_Main_MenuBar;

	    @FXML
	    private GridPane Main_App_Main_GridPane;

	    @FXML
	    private Button Main_App_Main_shortcut_btn_Home;

	    @FXML
	    private Label Main_App_Main_shortcut_Btn_Home_lab;

	    @FXML
	    private Button Main_App_Main_shortcut_Btn_Client;

	    @FXML
	    private Label Main_App_Main_shortcut_Btn_Client_lab;

	    @FXML
	    private Button Main_App_Main_shortcut_Btn_Shop;

	    @FXML
	    private Label Main_App_Main_shortcut_Btn_Shop_lab;

	    @FXML
	    private Button Main_App_Main_shortcut_Btn_Supplier;

	    @FXML
	    private Label Main_App_Main_shortcut_Btn_Supplier_lab;

	    @FXML
	    private Button Main_App_Main_shortcut_Btn_Product;

	    @FXML
	    private Label Main_App_Main_shortcut_Btn_Product_lab;

	    @FXML
	    private Label labeltest;

	    @FXML
	    void GOFORIT(MouseEvent event) {
	    	ClientUiController CUC=new ClientUiController();
	    }
	
	
	  
}
