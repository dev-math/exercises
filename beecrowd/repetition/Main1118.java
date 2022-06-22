import java.util.Scanner;

public class Main1118 {
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    calcAverage();
    while (!endGame()) {
      calcAverage();
    }
  }

  static boolean endGame() {
    int n = -1;
    while (true) {
      if (n < 1 || n > 2) {
        System.out.println("novo calculo (1-sim 2-nao)");
        n = in.nextInt();
      } else {
        return (n == 1) ? (false) : (true);
      }
    }
  }

  static void calcAverage() {
    double score1 = in.nextDouble();
    while (score1 < 0 || score1 > 10) {
      System.out.println("nota invalida");
      score1 = in.nextDouble();
    }
    double score2 = in.nextDouble();
    while (score2 < 0 || score2 > 10) {
      System.out.println("nota invalida");
      score2 = in.nextDouble();
    }
    double media = (score1 + score2) / 2;
    System.out.printf("media = %.2f\n", media);
  }
}
