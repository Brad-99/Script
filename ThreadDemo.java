public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo PuppyThread = new ThreadDemo();
        PuppyThread.start();
        System.out.println("Out of thread");
    }

    public void run() {
        System.out.println("In a thread");
    }
}
