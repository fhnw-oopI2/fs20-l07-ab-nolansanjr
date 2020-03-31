package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class ApplicationUI extends FlowPane {

    private Button button;
    private Label label;
    private int count = 0;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        button = new Button("Add Label");
        button.setOnAction(button -> createLabel());
    }

    public void layoutControls(){
        getChildren().add(button);
        setPadding(new Insets(5));
    }

    public void createLabel(){
        count++;
        label = new Label("Label " + count);
        label.setPadding(new Insets(5));
        getChildren().add(label);
    }
}
