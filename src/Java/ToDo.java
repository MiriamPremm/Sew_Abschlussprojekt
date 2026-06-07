package Java;

public class ToDo {
    private String titel;
    private String faelligkeit;
    private boolean erledigt;

    // Erstellt neues To-Do objekt mit fixem titel und datum
    public ToDo(String titel, String faelligkeit){
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


    //to-String Methode
    public String toString(){
        return titel + "    " + faelligkeit;
    }
}
