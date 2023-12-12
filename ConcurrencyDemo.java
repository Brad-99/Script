public class ConcurrencyDemo extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyDemo T01 = new ConcurrencyDemo();
        T01.start();
        System.out.println(amount); // 0
        amount++;
        System.out.println(amount); // 2
    }

    public void run() {
        amount++;
        System.out.println(amount); // 1
    }
}
