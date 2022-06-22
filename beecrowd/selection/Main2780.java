import java.util.Scanner;

public class Main2780 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    if (d <= 800) {
      System.out.println("1");
    } else if (d <= 1400) {
      System.out.println("2");
    } else {
      System.out.println("3");
    }
  }
}
