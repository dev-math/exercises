import java.util.Scanner;

public class Main1827 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int[][] m = new int[n][n];

      // main diagonal filled with 2
      for (int i = 0; i < n; i++) {
        m[i][i] = 2; // main diagonal
        m[i][n - i - 1] = 3; // secondary diagonal
      }

      // inner part filled with 1
      int innerPartStart = n / 3;
      for (int i = innerPartStart; i < n - innerPartStart; i++) {
        for (int j = innerPartStart; j < n - innerPartStart; j++) {
          m[i][j] = 1;
        }
      }

      m[n / 2][n / 2] = 4; // central element

      // print matrix
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(m[i][j]);
        }
        System.out.println();
      }

      System.out.println();
    }
  }
}
