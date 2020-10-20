package com.bitsilla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

        @Override
        public void start(Stage stage) {

            Parent root = null;
            try {
                System.out.println(getClass().getResource("/main.fxml").getPath());
                root = FXMLLoader.load(getClass().getResource("/main.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

            Scene scene = new Scene(root, 640, 480);

            stage.setTitle("MGHP Database Search Application");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }

}
