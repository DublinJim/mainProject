package com.example.mainproject;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {

        System.out.println("June 3 ");

        System.out.println("added code");
        System.out.println("added more code");

        System.out.println("push from desktop");
        FXMLLoader fxmlLoader = new FXMLLoader(
            HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
// nothing here
        stage.setTitle("Desktop pc for sure");
        System.out.println("added more code");
        stage.setTitle("Laptop");

        stage.setScene(scene);
        stage.show();
        System.out.println("added more code");

    }
}
