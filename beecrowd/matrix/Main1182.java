import java.util.Scanner;

public class Main1182 {
  static double roundNum(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int column = in.nextInt();
    in.nextLine();
    char T = in.nextLine().charAt(0);

    double[][] m = new double[12][12];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = in.nextDouble();
      }
    }

    double sum = 0;;
    int count = 0;
    for (int i = 0; i < m.length; i++) {
      sum += m[i][column];
      count++;
    }

    sum = roundNum(sum, 1);
    if (T == 'S') {
      System.out.printf("%.1f\n", sum);
    } else if (T == 'M') {
      System.out.printf("%.1f\n", sum / count);
    }
  }
}
