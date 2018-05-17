package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MainStackPaneController{

    @FXML
    private StackPane mainStackPane;
    @FXML
    public void initialize() {
        loadLoginPanel();
    }

    public void setScreen(AnchorPane anchorPane){
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(anchorPane);
    }
    
    public void loadLoginPanel(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("LoginPanelFXML.fxml"));
        AnchorPane anchorPane = null;
        try {
            anchorPane = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoginPanelFXMLController loginPanelFXMLController = loader.getController();
        loginPanelFXMLController.setController(this);
        setScreen(anchorPane);
    }
    
}
