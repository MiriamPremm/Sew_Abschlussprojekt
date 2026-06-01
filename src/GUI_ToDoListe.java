import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GUI_ToDoListe extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("HBox in BorderPane");

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 400, 200); // w, h
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
