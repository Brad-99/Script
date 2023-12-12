import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File puppyToy = new File("puppyToy.txt");
            Scanner myReader = new Scanner(puppyToy);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            if (puppyToy.exists()) {
                System.out.println("File name: " + puppyToy.getName());
                System.out.println("Absolute path: " + puppyToy.getAbsolutePath());
                System.out.println("Writeable: " + puppyToy.canWrite());
                System.out.println("Readable " + puppyToy.canRead());
                System.out.println("File size in bytes " + puppyToy.length());
            } else {
                System.out.println("The file does not exist.");
            }
        } catch (FileNotFoundException sthWrong) {
            System.out.println("error");
            sthWrong.printStackTrace();
        }
    }
}
