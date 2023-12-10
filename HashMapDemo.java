import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println("Which country's capital your interested in knowing?");
        Scanner TellMe = new Scanner(System.in);

        String UserInputCountry = TellMe.nextLine();

        if (capitalCities.containsKey(UserInputCountry)) {
            // Print the capital city of the entered country
            System.out
                    .println("The capital of " + UserInputCountry + " is " + capitalCities.get(UserInputCountry) + ".");
        } else {
            System.out.println(UserInputCountry + "? I have no idea what that is.");
        }

        TellMe.close();
    }
}
