package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ToDoFile {

    String path;

    public ToDoFile(String path) {
        this.path = path;
    }

    public void printHelp() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("\t -l  Lists all the tasks");
        System.out.println("\t -a  Adds a new task");
        System.out.println("\t -r  Removes an task");
        System.out.println("\t -c  Completes an task");
    }

    public void printToDoList() {
        Path filePath = Paths.get(this.path);
        try {
            List<String> fileLines = Files.readAllLines(filePath, UTF_8);
            if (fileLines.isEmpty()) {
                System.out.println("No todos for today! :)");
            } else {
                for (int i = 0; i < fileLines.size(); i++) {
                    System.out.println(fileLines.get(i));
                }
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: ToDoList");
        }
    }

    public void addTask() {
        Path filePath = Paths.get(this.path);
        String addItem = "4 - feed monkey";
        try {
            Files.write(filePath, addItem.getBytes(), StandardOpenOption.APPEND);

        } catch (Exception e) {
            System.out.println("Unable to add: no task provided");
        }
    }

    public void removeTask() {
        List<String> lines;
        Path filePath = Paths.get(this.path);
        try {
            lines = Files.readAllLines(filePath);
            lines.remove(1);
            Files.write(filePath, lines);
        } catch (Exception e) {
            System.out.println("Unable to remove task provided");
        }
    }

}




