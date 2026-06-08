
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI_ToDoListe extends Application {
    @Override
    public void start(Stage stage) {


        CheckBox cd = new CheckBox("Mathe lernen");

        /*VBox vbox1 = new VBox(10);
        stage.setTitle("HBox in BorderPane");

        TextField aufgabeFeld = new TextField();
        aufgabeFeld.setPromptText("Neue Aufgabe eingeben");

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 400, 200); // w, h
        stage.setScene(scene);
        borderPane.setLeft(cd);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


