import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Counter extends Application {

    private int count;
    private Text countText;

    @Override
    public void start(Stage primaryStage) {
        count = 50;
        countText = new Text("Value: 50");

        Button inc = new Button("Increase");
        inc.setOnAction(this::incProcessButtonPress);

        Button dec = new Button("Decrease");
        dec.setOnAction(this::decProcessButtonPress);

        FlowPane pane = new FlowPane(inc, dec, countText);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: red");

        Scene scene = new Scene(pane, 400, 100);

        primaryStage.setTitle("Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void decProcessButtonPress(ActionEvent actionEvent) {
        count--;
        countText.setText("Value: " + count);
    }

    private void incProcessButtonPress(ActionEvent actionEvent) {
        count++;
        countText.setText("Value: " + count);
    }
}
