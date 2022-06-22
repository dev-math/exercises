import java.util.Scanner;

public class Main1180 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] x = new int[n];

    for (int i = 0; i < x.length; i++) {
      x[i] = in.nextInt();
    }

    lowerNum(x);
  }

  static void lowerNum(int[] arr) {
    int lower = arr[0];
    int pos = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < lower) {
        lower = arr[i];
        pos = i;
      }
    }

    System.out.println("Menor valor: " + lower);
    System.out.println("Posicao: " + pos);
  }
}
