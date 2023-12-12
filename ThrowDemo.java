public class ThrowDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("you must be at least 18.");
        } else {
            System.out.println("ok you're old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(17); // Set age to 15 (Which is below 18...)
    }
}
