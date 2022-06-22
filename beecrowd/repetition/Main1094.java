import java.util.Scanner;

public class Main1094 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int c = 0;
    int r = 0;
    int s = 0;
    for (int i = 0; i < n; i++) {
      int amount = in.nextInt();
      char animalType = in.next().charAt(0);
      switch (animalType) {
        case 'C':
          c += amount;
          break;
        case 'R':
          r += amount;
          break;
        case 'S':
          s += amount;
          break;
      }
    }

    int total = c + r + s;
    System.out.println("Total: " + total + " cobaias");
    System.out.println("Total de coelhos: " + c);
    System.out.println("Total de ratos: " + r);
    System.out.println("Total de sapos: " + s);
    double percC = ((double) c * 100 / total);
    double percR = ((double) r * 100 / total);
    double percS = ((double) s * 100 / total);
    System.out.printf("Percentual de coelhos: %.2f %%\n", percC);
    System.out.printf("Percentual de ratos: %.2f %%\n", percR);
    System.out.printf("Percentual de sapos: %.2f %%\n", percS);

  }
}
