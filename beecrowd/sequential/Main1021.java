import java.util.Scanner;

public class Main1021 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int vetorNotes[] = {100, 50, 20, 10, 5, 2};
    double vetorCoins[] = {1.0, 0.5, 0.25, 0.1, 0.05, 0.01};
    double total = in.nextDouble();
    int totalNotes = (int) total;
    double totalCoins = total - totalNotes;
    System.out.println("NOTAS:");
    totalCoins += notas(vetorNotes, totalNotes, 0);
    System.out.println("MOEDAS:");
    coins(vetorCoins, totalCoins, 0);
  }

  static int notas(int[] vetorNotes, int temp, int vetorPos) {
    int note = vetorNotes[vetorPos];
    System.out.println(temp / note + " nota(s) de R$ " + note + ".00");
    temp = temp % note;
    if (vetorPos != vetorNotes.length - 1) {
      return notas(vetorNotes, temp, vetorPos + 1);
    } else {
      return temp;
    }
  }

  static void coins(double[] vetorCoins, double temp, int vetorPos) {
    double coin = vetorCoins[vetorPos];
    int print = (int) Math.round(temp / coin);
    temp -= print * coin;

    System.out.printf(print + " moeda(s) de R$ %.2f\n", coin);
    if (vetorPos != vetorCoins.length - 1) {
      coins(vetorCoins, temp, vetorPos + 1);
    }
  }
}
