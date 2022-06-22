import java.util.Scanner;

public class Main1178 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double x[] = new double[100];
    x[0] = in.nextDouble();
    System.out.printf("N[0] = %.4f\n", x[0]);

    for (int i = 1; i < x.length; i++) {
      x[i] = x[i-1] / 2;
      System.out.printf("N[%d] = %.4f\n", i, x[i]);
    }
  }
}
