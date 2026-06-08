package Java;

import java.util.ArrayList;

public class ToDoManager {
    // Liste zum speichern von allen todos
    private ArrayList<ToDo> todos;

    //Erstellt neuen todoManager mit leerer lsite
    public ToDoManager() {
        this.todos = new ArrayList<>();
    }

    public void addToDo(String titel, String faelligkeit) {
        ToDo todo = new ToDo(titel, faelligkeit);
        todos.add(todo);
    }

    public void removeToDo(int index) {
        todos.remove(index);
    }

    public void markErledigt(int index) {
        todos.get(index).setErledigt(true);
    }

    public void printToDo(){
        for (ToDo todo : todos) {
            System.out.println(todo);
        }
    }

    //alle todos anzeigen
    public ArrayList<ToDo> getToDos() {
        return todos;
    }

}
