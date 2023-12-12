import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        // ------------------------------------------------------
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        // Consumer<Integer> method = new Consumer<Integer>() {
        // @Override
        // public void accept(Integer n) {
        // System.out.println(n);
        // }
        // };

        numbers.forEach(method);
    }
}
