
package com.example.zzzfastfood_test4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FastFood.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load(), 1292, 864);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }



    public static void main(String[] args) {
        Help.about();
        launch();
    }
}