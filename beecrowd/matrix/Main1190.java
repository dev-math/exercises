import java.util.Scanner;

public class Main1190 {
  static double roundNum(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char O = in.nextLine().charAt(0);
    int[][] m = new int[12][12];
    double sum = 0;
    int count = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = in.nextInt();

        if (j > i && j > m.length - 1 - i) {
          sum += m[i][j];
        }
      }
    }

    sum = roundNum(sum, 1);
    if (O == 'S') {
      System.out.printf("%.1f\n", sum);
    } else if (O == 'M') {
      System.out.printf("%.1f\n", sum / count);
    }
  }
}
