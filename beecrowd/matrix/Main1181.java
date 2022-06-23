import java.util.Scanner;

public class Main1181 {
  static double roundNum(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    in.nextLine();
    char t = in.nextLine().charAt(0);

    double[][] m = new double[12][12];
    double sum = 0;
    int count = 0;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = in.nextDouble();

        if (i == l) {
          sum += m[i][j];
          count++;
        }
      }
    }

    sum = roundNum(sum, 1);
    if (t == 'S') {
      System.out.printf("%.1f\n", sum);
    } else if (t == 'M') {
      System.out.printf("%.1f\n", sum / count);
    }
  }
}
