package ToDoApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ToDoFile {

    String path;

    public ToDoFile(String path) {
    this.path = path;
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
            System.out.println("Unable to read file: ToDoList.txt");;
        }
    }


}




