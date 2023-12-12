import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPattern {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3SCHOOLS!");
        Matcher matcher1 = pattern.matcher("Visit 3SCHOOLS!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        // ----------------------------------------
        boolean matchFound1 = matcher1.find();
        if (matchFound1) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }
}
