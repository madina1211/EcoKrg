package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Locale locale = new Locale("en", "EN");
        ResourceBundle bundle = ResourceBundle.getBundle("bundle.text", locale);
        Parent root = FXMLLoader.load(getClass().getResource("../model/view/main.fxml"), bundle);
        primaryStage.setTitle("Menu");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
