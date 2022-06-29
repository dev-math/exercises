import java.util.Scanner;

public class Main1435 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    while (n != 0) {
      int[][] m = new int[n][n];
      int center;
      if (n % 2 == 0) {
        center = n / 2;
      } else {
        center = (n + 1) / 2;
      }

      for (int k = 1, end = n; k <= center; k++, end--) {
        for (int i = k - 1; i < end; i++) {
          for (int j = k - 1; j < end; j++) {
            m[i][j] = k;
          }
        }
      }

      // print matrix
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.printf("%3d", m[i][j]);
          if (j == n - 1) {
            System.out.println();
          } else {
            System.out.print(" ");
          }
        }
      }

      System.out.println();
      n = in.nextInt();
    }
  }
}
