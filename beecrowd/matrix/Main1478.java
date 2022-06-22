import java.util.Scanner;

public class Main1478 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while (n != 0) {
      int[][] m = new int[n][n];

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          m[i][j] = Math.abs(i - j) + 1;
        }
      }


      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.printf("%3d", m[i][j]);
          if (j != n - 1) {
            System.out.print(" ");
          } else {
            System.out.println();
          }
        }
      }

      System.out.println();
      n = in.nextInt();
    }

  }
}
