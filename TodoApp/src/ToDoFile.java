import java.io.FileWriter;
import java.io.IOException;

public class ToDoFile {

    public void setMyList(FileWriter myList) throws IOException {
        try {
            myList = new FileWriter("ToDoFile.txt");
            myList.write("Files in Java might be tricky, but it is fun enough!");
            myList.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

        }

