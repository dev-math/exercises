import java.util.Scanner;

public class Main1040 {
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    float n1 = in.nextFloat();
    float n2 = in.nextFloat();
    float n3 = in.nextFloat();
    float n4 = in.nextFloat();
    float average = (2 * n1 + 3 * n2 + 4 * n3 + n4) / 10;
    System.out.printf("Media: %.1f\n", average);
    studentAverage(average, false);
  }

  static void studentAverage(float average, boolean lastChance) {
    if (average < 5) {
      System.out.println("Aluno reprovado.");
    } else if (average >= 7 || (lastChance && average >= 5)) {
      System.out.println("Aluno aprovado.");
    } else if (!lastChance){
      System.out.println("Aluno em exame.");
      float score = in.nextFloat();
      System.out.printf("Nota do exame: %.1f\n", score);
      average = (average + score) / 2;
      studentAverage(average, true); 
    }

    if (lastChance) {
      System.out.printf("Media final: %.1f\n", average);
    }
  }
}
