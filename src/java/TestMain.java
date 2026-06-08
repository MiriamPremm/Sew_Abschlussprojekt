package java;

public class TestMain {
    public static void main(String[] args) {
        ToDoManager Liste1 = new ToDoManager();

        Liste1.addToDo("SEW", "08.06.2026");
        Liste1.addToDo("Mathe lernen", "12.06.2026");

        Liste1.printToDo();

        //erledigen
        Liste1.markErledigt(0);

        System.out.println();
        Liste1.printToDo();

        //entfernen
        Liste1.removeToDo(1);
        System.out.println();

        Liste1.printToDo();
    }
}