package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {

    private Slider slider;
    private TextField textfield;


    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        slider = new Slider();
        textfield = new TextField();
        NumberStringConverter convert = new NumberStringConverter();
        textfield.textProperty().bindBidirectional(slider.valueProperty(),convert);
    }


    public void layoutControls(){
        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(5);
        setPadding(new Insets(20));
        getChildren().addAll(textfield,slider);
    }
}
