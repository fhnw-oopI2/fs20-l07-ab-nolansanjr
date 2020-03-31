package ch.fhnw.oop2.module07.ab2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import java.text.DecimalFormat;


public class ApplicationUI extends VBox {

    private Slider slider;
    private Label label;
    private DecimalFormat decimal;


    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls(){
        slider = new Slider();
        label = new Label(String.valueOf(slider.getValue()));
        decimal = new DecimalFormat("0.00");
        slider.valueProperty().addListener((observableValue, oldValue, newValue) -> label.setText(decimal.format(newValue)));
    }


    public void layoutControls(){
        slider.setMin(0);
        slider.setMax(10);
        slider.setValue(5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(5);
        setAlignment(Pos.BASELINE_CENTER);
        setPadding(new Insets(20));
        getChildren().addAll(label,slider);
    }


}
