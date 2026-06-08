package Java;

import java.util.ArrayList;


//Fehlerbehandlung, JavaDoc , im nachhinein bearbeiten
public class ToDoManager {
    // Liste zum speichern von allen todos
    private ArrayList<ToDo> todos = new ArrayList<>();



    public void addToDo(String titel, String faelligkeit) {
        //neues to-do objekt(ruft konstruktor auf)
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

    //alle todos anzeigen / getter
    public ArrayList<ToDo> getToDos() {
        return todos;
    }

}
