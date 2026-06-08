package java;

public class ToDo {

    private static int naechsteId = 1;
    private int id;

    private String titel;
    //LocalDate??
    private String faelligkeit;
    private boolean erledigt;

    // Erstellt neues To-Do objekt mit fixem titel und datum
    public ToDo(String titel, String faelligkeit){
        //nimmt die aktuelle nächste id und gibt sie dem erstellten to-do
        this.id = naechsteId;
        //erhöht nächsteId für das nächste Objekt
        naechsteId++;

        this.titel = titel;
        this.faelligkeit = faelligkeit;
        //am anfang immer falsch
        this.erledigt = false;

    }


    //getter/setter
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getFaelligkeit() {
        return faelligkeit;
    }

    public void setFaelligkeit(String faelligkeit) {
        this.faelligkeit = faelligkeit;
    }

    public boolean isErledigt() {
        return erledigt;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //to-String Methode
    public String toString(){
        String status;

        if (erledigt) {
            status = "erledigt";
        } else {
            status = "offen";
        }

        return status + ": " + titel + " - fällig am: " + faelligkeit;
    }
}