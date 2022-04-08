package model.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;

public class PaperController {

    @FXML
    private JFXButton exitButton;

    @FXML
    private JFXButton mapButton;

    @FXML
    private JFXButton infoButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void exitButtonOAction(ActionEvent event) {

        loadPage(700, 600, "src/model/view/main", "Menu");
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void infoButtonOnAction(ActionEvent event) {

    }

    @FXML
    void mapButtonOnAction(ActionEvent event) {

    }

    private void loadPage (double height, double width, String page, String setTitle){
        Parent root = null;

        try {
            URL url = new File(page + ".fxml").toURI().toURL();
            root = FXMLLoader.load(url);
            Stage registerStage = new Stage();
            registerStage.setTitle(setTitle);
            registerStage.initStyle(StageStyle.DECORATED);
            registerStage.setScene(new Scene(root, height, width));
            registerStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

    }


}
