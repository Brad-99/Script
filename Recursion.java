public class Recursion {
  public static void main(String[] args) {
    int result = sum(4);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}


// 4 +
// 3 +
// 2 +
// 1