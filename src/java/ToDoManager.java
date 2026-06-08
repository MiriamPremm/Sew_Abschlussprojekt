package java;

import java.util.ArrayList;


//Fehlerbehandlung, JavaDoc , im nachhinein bearbeiten
public class ToDoManager {
    // Liste zum speichern von allen todos
    private ArrayList<ToDo> todos = new ArrayList<>();

    public void addToDo(String titel, String faelligkeit) {
        ToDo todo = new ToDo(titel, faelligkeit);
        todos.add(todo);
    }

    public void removeToDoById(int id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                todos.remove(i);
                return;
            }
        }
    }

    public void markErledigtById(int id) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                todo.setErledigt(true);
                return;
            }
        }
    }

    public void setErledigtById(int id, boolean erledigt) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                todo.setErledigt(erledigt);
                return;
            }
        }
    }

    public void printToDo() {
        for (ToDo todo : todos) {
            System.out.println(todo);
        }
    }

    public ArrayList<ToDo> getToDos() {
        return todos;
    }

}
