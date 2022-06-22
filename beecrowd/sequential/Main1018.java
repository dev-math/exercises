import java.util.Scanner;

public class Main1018 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int total = in.nextInt();
    int vetorNotas[] = {100, 50, 20, 10, 5, 2, 1};
    System.out.println(total);
    notas(vetorNotas, total, 0);
  }

  static void notas(int[] vetorNotas, int temp, int vetorPos) {
    int nota = vetorNotas[vetorPos];
    System.out.println(temp / nota + " nota(s) de R$ " + nota + ",00");
    temp = temp % nota;
    if (vetorPos != vetorNotas.length - 1) {
      notas(vetorNotas, temp, vetorPos + 1);
    }
  }
}
