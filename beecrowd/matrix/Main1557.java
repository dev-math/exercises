import java.util.Scanner;

public class Main1557 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    while (n != 0) {
      int[][] m = new int[n][n];
      int c = 1;
      for (int i = 0; i < n; i++) {
        int valorAtual = c;
        for (int j = 0; j < n; j++) {
          m[i][j] = valorAtual;
          valorAtual = valorAtual * 2;
        }
        c = c * 2;
      }

      int T = String.valueOf(m[n - 1][n - 1]).length();
      // imprime o vetor:
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.printf("%" + T + "d", m[i][j]);
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
