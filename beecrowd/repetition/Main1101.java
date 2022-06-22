import java.util.Scanner;

public class Main1101 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      int num1 = in.nextInt();
      int num2 = in.nextInt();

      if (num1 <= 0 || num2 <= 0) {
        break;
      }

      if (num1 > num2) {
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
      }

      int sum = 0;
      for (int i = num1; i <= num2; i++) {
        sum += i;
        System.out.print(i);
        System.out.print(" ");
      }
      System.out.print("Sum=" + sum + "\n");

    }
  }
}
