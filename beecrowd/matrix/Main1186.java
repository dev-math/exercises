import java.util.Scanner;

public class Main1186 {
  static double roundNum(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char o = in.nextLine().charAt(0);
    double[][] m = new double[12][12];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = in.nextDouble();
      }
    }

    double sum = 0;
    int count = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = m.length - i; j < m.length; j++) {
        sum += m[i][j];
        count++;
      }
    }

    sum = roundNum(sum, 1);
    if (o == 'S') {
      System.out.printf("%.1f\n", sum);
    } else if (o == 'M') {
      System.out.printf("%.1f\n", sum / count);
    }
  }
}
