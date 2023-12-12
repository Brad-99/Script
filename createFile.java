
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;

public class createFile {
    public static void main(String[] args) {
        try {
            File puppyToy = new File("puppyToy.txt");
            if (puppyToy.createNewFile()) {
                System.out.println("File created: " + puppyToy.getName());
            } else {
                System.out.println("File alrdy exists");
            }
        } catch (IOException somethingWrong) {
            System.out.println("An error occurred");
            somethingWrong.printStackTrace();
        }
        // -------------------------------------------
        try {
            FileWriter puppyPen = new FileWriter("puppyToy.txt");
            puppyPen.write("M8 Java is easy innit?");
            puppyPen.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException somethingWrong) {
            System.out.println("An error occurred");
            somethingWrong.printStackTrace();
        }
    }
}
