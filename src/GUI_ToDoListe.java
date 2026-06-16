import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import jdk.internal.misc.CarrierThreadLocal;

import java.util.Optional;


public class GUI_ToDoListe extends Application {
    /*@Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        TextField input = new TextField();
        input.setPromptText("Neue To-Do eingeben...");

        Button addButton = new Button("Hinzufügen");

        VBox todoList = new VBox(5);

        addButton.setOnAction(e -> {
            String text = input.getText().trim();
            if (!text.isEmpty()) {
                todoList.getChildren().add(createTodoItem(text));
                input.clear();
            }
        });

        root.getChildren().addAll(input, addButton, todoList);

        Scene scene = new Scene(root, 350, 400);
        stage.setTitle("To-Do Liste");
        stage.setScene(scene);
        stage.show();
    }

    private HBox createTodoItem(String text) {
        HBox box = new HBox(10);

        Text todoText = new Text(text);
        CheckBox check = new CheckBox();

        // Wenn Checkbox angehakt → To-Do entfernen
        check.setOnAction(e -> {
            if (check.isSelected()) {
                ((VBox) box.getParent()).getChildren().remove(box);
            }
        });

        box.getChildren().addAll(check, todoText);
        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }*/
    @Override
    public void start(Stage stage) {

        Button button = new Button("Add");
        //CheckBox cd = new CheckBox("Mathe lernen");
        TextField feld = new TextField();

        VBox aufgaben = new VBox(10);

        button.setOnAction(e -> {

        });

        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 400, 200); // w, h
        stage.setScene(scene);
        borderPane.setCenter(button);
        borderPane.setCenter(aufgaben);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
