package java;

import java.util.ArrayList;
import java.util.Date;

/**
 * Verwaltet alle To-Dos
 */
public class ToDoManager {

    private ArrayList<ToDo> todos = new ArrayList<>();

    /**
     * Fügt ein neues To-Do hinzu
     *
     * @param titel Titel der Aufgabe
     * @param faelligkeit Fälligkeitsdatum der Aufgabe
     */
    public void addToDo(String titel, Date faelligkeit) {
        ToDo todo = new ToDo(titel, faelligkeit);
        todos.add(todo);
    }

    /**
     * Entfernt ein To-Do über seine ID
     *
     * @param id ID des To-Dos
     */
    public void removeToDoById(int id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                todos.remove(i);
                return;
            }
        }
    }

    /**
     * Markiert ein To-Do als erledigt
     *
     * @param id ID des To-Dos
     */
    public void markErledigtById(int id) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                todo.setErledigt(true);
                return;
            }
        }
    }

    /**
     * Setzt den Status eines To-Dos
     *
     * @param id ID des To-Dos
     * @param erledigt true = erledigt, false = offen
     */
    public void setErledigtById(int id, boolean erledigt) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                todo.setErledigt(erledigt);
                return;
            }
        }
    }

    /**
     * Bearbeitet ein vorhandenes To-Do
     *
     * @param id ID des To-Dos
     * @param neuerTitel neuer Titel
     * @param neueFaelligkeit neues Fälligkeitsdatum
     */
    public void bearbeiteToDoById(int id, String neuerTitel, Date neueFaelligkeit) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                todo.setTitel(neuerTitel);
                todo.setFaelligkeit(neueFaelligkeit);
                return;
            }
        }
    }

    /**
     * Sucht ein To-Do über die ID
     *
     * @param id gesuchte ID
     * @return gefundenes To-Do oder null
     */
    public ToDo findeToDoById(int id) {
        for (ToDo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }

        return null;
    }

    /**
     * Gibt alle To-Dos in der Konsole aus
     */
    public void printToDo() {
        for (ToDo todo : todos) {
            System.out.println(todo);
        }
    }

    /**
     * Gibt alle gespeicherten To-Dos zurück
     *
     * @return Liste aller To-Dos
     */
    public ArrayList<ToDo> getToDos() {
        return todos;
    }
}