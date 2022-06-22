import java.util.Scanner;

public class Main2542 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int n = in.nextInt();
      int m = in.nextInt();
      int l = in.nextInt();

      int[][] mCards = new int[m][n];
      int[][] lCards = new int[l][n];

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          mCards[i][j] = in.nextInt();
        }
      }

      for (int i = 0; i < l; i++) {
        for (int j = 0; j < n; j++) {
          lCards[i][j] = in.nextInt();
        }
      }

      int cardM = in.nextInt();
      int cardL = in.nextInt();
      int a = in.nextInt();

      if (mCards[cardM - 1][a - 1] == lCards[cardL - 1][a - 1]) {
        System.out.println("Empate");
      } else if (mCards[cardM - 1][a - 1] > lCards[cardL - 1][a - 1]) {
        System.out.println("Marcos");
      } else {
        System.out.println("Leonardo");
      }
    }
  }
}
