package ToDoApp;

public class Main {
    public static void main(String[] args) {

        ToDoFile toDoFile = new ToDoFile("src/ToDoApp/ToDoList");

        if (args.length == 0) {
            toDoFile.printHelp();
        } else if (args[0].equals("-a")) {
            toDoFile.addTask();
        } else if (args[0].equals("-l")) {
            toDoFile.printToDoList();
        }
    }
}
