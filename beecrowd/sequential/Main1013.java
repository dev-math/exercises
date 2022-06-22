import java.util.Scanner;

public class Main1013 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    System.out.println(greatestNumber(a, greatestNumber(b, c)) + " eh o maior");
  }

  static int greatestNumber(int num1, int num2) {
    return (num1 + num2 + Math.abs(num1 - num2)) / 2;
  }
}
