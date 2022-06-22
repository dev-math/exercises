import java.util.Scanner;

public class Main1045 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = in.nextDouble();
    double b = in.nextDouble();
    double c = in.nextDouble();
    double[] orderNums = orderNum(a, b, c);
    triangleTypes(orderNums[0], orderNums[1], orderNums[2]);
  }

  static double[] orderNum(double num1, double num2, double num3) {
    if (num1 < num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }

    if (num2 < num3) {
      num2 = num2 + num3;
      num3 = num2 - num3;
      num2 = num2 - num3;
    }

    if (num1 < num2) {
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
    }

    return new double[] { num1, num2, num3 };
  }

  static void triangleTypes(double sideA, double sideB, double sideC) {
    if (sideA >= (sideB + sideC)) {
      System.out.println("NAO FORMA TRIANGULO");
    } else if (sideA * sideA == sideB * sideB + sideC * sideC) {
      System.out.println("TRIANGULO RETANGULO");
    } else if (sideA * sideA > sideB * sideB + sideC * sideC) {
      System.out.println("TRIANGULO OBTUSANGULO");
    } else if (sideA * sideA < sideB * sideB + sideC * sideC) {
      System.out.println("TRIANGULO ACUTANGULO");
    }

    if (sideA == sideB && sideB == sideC) {
      System.out.println("TRIANGULO EQUILATERO");
    } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
      System.out.println("TRIANGULO ISOSCELES");
    }
  }
}
