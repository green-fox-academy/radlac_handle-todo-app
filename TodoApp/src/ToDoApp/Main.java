package ToDoApp;

public class Main {
    public static void main(String[] args) {

        ToDoFile toDoFile = new ToDoFile("src/ToDoApp/ToDoList");
        int index = Integer.parseInt(args[1])-1;
        if (args.length == 0) {
            toDoFile.printHelp();
        } else if (args[0].equals("-a")) {
            toDoFile.addTask();
        } else if (args[0].equals("-l")) {
            toDoFile.printToDoList();
        } else if (args[0].equals("-r")) {
            toDoFile.removeTask(index);
        } else if (args[0] != "-l")
            if (args[0] != "-a")
                if (args[0] != "-r")
                    if (args[0] != "-c") {
                        System.out.println("Unsupported argument");
                        System.out.println();
                        toDoFile.printHelp();
                    }
    }
}
