package model.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.net.URL;

public class PlasticInfoController {

    @FXML
    private VBox vbox;

    @FXML
    private Button bottleButton;

    @FXML
    private Button plasticBagButton;

    @FXML
    private Button plasticDishButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void bottleButtonOnAction(ActionEvent event) {
        try {
            anchorPane.getChildren().setAll(loadAnchorPage("src/model/view/bottle.fxml"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void plasticBagButtonOnAction(ActionEvent event) {
        try {
            anchorPane.getChildren().setAll(loadAnchorPage("src/model/view/bag.fxml"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void plasticDishButtonOnAction(ActionEvent event) {
        try {
            anchorPane.getChildren().setAll(loadAnchorPage("src/model/view/dish.fxml"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private AnchorPane loadAnchorPage (String page){
        AnchorPane pane = null;
        try {
            URL url = new File(page).toURI().toURL();
            pane = FXMLLoader.load(url);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return pane;
    }

}
