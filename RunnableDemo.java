public class RunnableDemo implements Runnable {
    public static void main(String[] args) {
        RunnableDemo puppy = new RunnableDemo();
        Thread T01 = new Thread(puppy);
        T01.start();
        System.out.println("Out of thread");
    }

    public void run() {
        System.out.println("In a thread");
    }
}
