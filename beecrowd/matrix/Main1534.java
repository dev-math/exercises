import java.util.Scanner;

public class Main1534 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int N = in.nextInt();
      int[][] m = new int[N][N];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          m[i][j] = 3; // fill matrix with 3
        }
      }

      for (int i = 0; i < N; i++) {
        m[i][i] = 1; // main diagonal
        m[i][N - 1 - i] = 2; // secondary diagonal
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          System.out.print(m[i][j]);
        }
        System.out.println();
      }
    }
  }
}
