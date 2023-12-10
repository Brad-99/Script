import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Date {
    public static void main(String[] args) {
        LocalDate DateNow = LocalDate.now(); // Create a date object
        LocalTime TimeNow = LocalTime.now();
        LocalDateTime DateTimeNow = LocalDateTime.now();

        System.out.println(DateNow); // Display the current date
        System.out.println(TimeNow);
        System.out.println("Before Formatting: " + DateTimeNow);

        // Formatting
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDate = DateTimeNow.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

    }
}
