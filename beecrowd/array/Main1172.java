import java.util.Scanner;

public class Main1172 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] x = new int[10];
    for (int i = 0; i < x.length; i++) {
      x[i] = in.nextInt();
      if (x[i] <= 0) {
        x[i] = 1;
      }
    }

    for (int i = 0; i < x.length; i++) {
      System.out.println("X[" + i + "] = " + x[i]);
    }
  }
}
