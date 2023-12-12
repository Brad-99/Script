public class tryCatch {
    public static void main(String[] args) {
        try {
            int[] size3Array = { 1, 2, 3 };
            System.out.println(size3Array[10]);
        } catch (Exception except) {
            System.out.println("Something's wrong");
        }
    }
}
