public class AvoidConcurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        AvoidConcurrency T01 = new AvoidConcurrency();
        T01.start();
        // Wait for the thread to finish
        while (T01.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }

    public void run() {
        amount = amount + 5;
        System.out.println("So for the run() thread we now at... " + amount);
    }
}
