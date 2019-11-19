import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.shape.Circle;

import javafx.event.ActionEvent;


public class CirclePane extends GridPane {
    private Label radius;
    private TextField radiusInput;
    Circle circle = new Circle(1);


    public CirclePane(){
        Font font = new Font(18);

        radius = new Label("Radius:");
        radius.setFont(font);
        GridPane.setHalignment(radius, HPos.LEFT);

        radiusInput = new TextField();
        radiusInput.setFont(font);
        radiusInput.setPrefWidth(50);
        radiusInput.setAlignment(Pos.CENTER);
        radiusInput.setOnAction(this::processReturn);


        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: white");

        add(radius, 0, 0);
        add(radiusInput, 1,0);
        add(circle, 2, 0);
    }

    public void processReturn(ActionEvent event){
        double newRadius = Double.parseDouble(radiusInput.getText());
        circle.setRadius(newRadius);
    }
}
