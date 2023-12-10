import java.util.LinkedList;

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        // Use addLast() to add the item to the end
        cars.addLast("Tesla");
        System.out.println(cars);

    }
}
