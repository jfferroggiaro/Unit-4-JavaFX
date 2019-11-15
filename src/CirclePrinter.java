import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CirclePrinter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new CirclePane(), 300, 100);

        primaryStage.setTitle("Circle Printer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
