package java;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Speichert eine einzige To-Do-Aufgabe
 */
public class ToDo {

    /**
     * Zählt die IDs für neue To-Dos hoch
     */
    private static int naechsteId = 1;

    private int id;
    private String titel;
    private Date faelligkeit;
    private boolean erledigt;

    /**
     * Erstellt ein neues To-Do
     *
     * @param titel Titel der Aufgabe
     * @param faelligkeit Datum, bis wann die Aufgabe fertig sein soll
     */
    public ToDo(String titel, Date faelligkeit) {
        this.id = naechsteId;
        naechsteId++;

        this.titel = titel;
        this.faelligkeit = faelligkeit;
        this.erledigt = false;
    }

    /**
     * @return ID der Aufgabe
     */
    public int getId() {
        return id;
    }

    /**
     * @return Titel der Aufgabe
     */
    public String getTitel() {
        return titel;
    }

    /**
     * @param titel neuer Titel der Aufgabe
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * @return Fälligkeitsdatum der Aufgabe
     */
    public Date getFaelligkeit() {
        return faelligkeit;
    }

    /**
     * @param faelligkeit neues Fälligkeitsdatum
     */
    public void setFaelligkeit(Date faelligkeit) {
        this.faelligkeit = faelligkeit;
    }

    /**
     * @return true, wenn die Aufgabe erledigt ist
     */
    public boolean isErledigt() {
        return erledigt;
    }

    /**
     * @param erledigt neuer Status der Aufgabe
     */
    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }

    /**
     * Gibt das To-Do als Text zurück
     *
     * @return To-Do mit ID, Status, Titel und Datum
     */
    @Override
    public String toString() {
        String status;

        if (erledigt) {
            status = "erledigt";
        } else {
            status = "offen";
        }

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        String datumText = format.format(faelligkeit);

        return "ID " + id + " - " + status + ": " + titel + " - fällig am: " + datumText;
    }
}