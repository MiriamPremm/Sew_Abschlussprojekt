package Java;

public class TestMain {
    public static void main(String[] args) {
        ToDoManager Liste1 = new ToDoManager();

        Liste1.addToDo("SEW Projekt", "08.06.2026");
        Liste1.addToDo("Mathe lernen", "12.06.2026");


        Liste1.printToDo();
        Liste1.markErledigt(0);

        System.out.println();
        System.out.println("Nach dem Erledigen:");
        Liste1.printToDo();

        Liste1.removeToDo(1);

        System.out.println();
        System.out.println("Nach dem Entfernen:");
        Liste1.printToDo();
    }
}