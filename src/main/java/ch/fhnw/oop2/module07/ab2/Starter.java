package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Starter extends Application{

    public void start (javafx.stage.Stage stage){

        Parent rootPanel = new ApplicationUI();
        Scene scene = new Scene(rootPanel);

        stage.setTitle("Slider");
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
