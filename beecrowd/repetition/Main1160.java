import java.util.Scanner;

public class Main1160 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int pA = in.nextInt();
      int pB = in.nextInt();
      double g1 = in.nextDouble();
      double g2 = in.nextDouble();
      popIncrease(pA, pB, g1, g2);
    }
  }


  static void popIncrease(int pA, int pB, double g1, double g2) {
    int years = 0;
    while (pA <= pB) {
      pA += (int) pA * g1 / 100;
      pB += (int) pB * g2 / 100;
      years++;
      if (years > 100) {
        System.out.println("Mais de 1 seculo.");
        return;
      }
    }

    System.out.println(years + " anos.");
  }
}
