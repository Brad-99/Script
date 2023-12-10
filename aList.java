import java.util.ArrayList;
import java.util.Collections;

public class aList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();
        // for each loop
        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> Numba = new ArrayList<Integer>();
        Numba.add(999);
        Numba.add(99);
        Numba.add(9);
        for (int i : Numba) {
            System.out.println(i);
        }
        System.out.println("First index of Numba is: " + Numba.get(0));

        // Collections Class
        Collections.sort(Numba);
        for (int i : Numba) {
            System.out.println(i);
        }
    }
}
