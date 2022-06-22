import java.util.Scanner;

public class Main1564 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      if (n == 0) {
        System.out.println("vai ter copa!");
      } else {
        System.out.println("vai ter duas!");
      }
    }
  }
}
