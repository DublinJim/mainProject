package com.example.mainproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        System.out.println("June 3 ");

        System.out.println("added code");
        System.out.println("added more code");
//added today 8/6
        System.out.println("push from desktop");
        FXMLLoader fxmlLoader = new FXMLLoader(
            HelloApplication.class.getResource("hello-view.fxml"));
//add more
no ipp

        System.out.println("added more code");

    }
}
