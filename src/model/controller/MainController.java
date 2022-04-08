package model.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;

public class MainController {

    @FXML
    private ImageView batteryButton1;

    @FXML
    private JFXButton kzButton;

    @FXML
    private JFXButton enButton;

    @FXML
    private JFXButton ruButton;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ImageView batteryButton;

    @FXML
    private ImageView paperButton;

    @FXML
    private ImageView plasticButton;

    @FXML
    void batteryButtonOnAction(MouseEvent event) {

        loadPage(700, 600, "src/model/view/battery", "Battery");
        Stage stage = (Stage) batteryButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void paperButtonOnAction(MouseEvent event) {

        loadPage(700, 600, "src/model/view/paper", "Paper");
        Stage stage = (Stage) batteryButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void plasticButtonOnAction(MouseEvent event) {

        loadPage(700, 600, "src/model/view/plastic", "Plastic");
        Stage stage = (Stage) batteryButton.getScene().getWindow();
        stage.close();
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

    public void kzButtonOnAction(ActionEvent event) {
    }
    public void ruButtonOnAction(ActionEvent event) {
    }
    public void enButtonOnAction(ActionEvent event) {
    }
}
