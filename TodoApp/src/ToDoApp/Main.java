package ToDoApp;

public class Main {
    public static void main(String[] args) {

        ToDoFile toDoFile = new ToDoFile("src/ToDoApp/ToDoList");

        if (args.length == 0) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println();
            System.out.println("\t -l  Lists all the tasks");
            System.out.println("\t -a  Adds a new task");
            System.out.println("\t -r  Removes an task");
            System.out.println("\t -c  Completes an task");
        } else if (args[0].equals("-a")) {
            toDoFile.addTask();
        } else if (args[0].equals("-l")) {
            toDoFile.printToDoList();
        }
    }
}
