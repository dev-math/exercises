import java.util.Scanner;

public class Main2552 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int N = in.nextInt();
      int M = in.nextInt();

      int[][] cheeseBreads = new int[N][M];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          cheeseBreads[i][j] = in.nextInt();
        }
      }

      int[][] gameBoard = new int[N][M];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          if (cheeseBreads[i][j] == 1) {
            if (i - 1 >= 0 && i - 1 <= N - 1 && cheeseBreads[i - 1][j] == 0) {
              gameBoard[i - 1][j]++;
            }

            if (i + 1 >= 0 && i + 1 <= N - 1 && cheeseBreads[i + 1][j] == 0) {
              gameBoard[i + 1][j]++;
            }

            if (j - 1 >= 0 && j - 1 <= M - 1 && cheeseBreads[i][j - 1] == 0) {
              gameBoard[i][j - 1]++;
            }

            if (j + 1 >= 0 && j + 1 <= M - 1 && cheeseBreads[i][j + 1] == 0) {
              gameBoard[i][j + 1]++;
            }

            gameBoard[i][j] = 9;
          }
        }
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          System.out.print(gameBoard[i][j]);
        }
        System.out.println();
      }

    }

  }
}
