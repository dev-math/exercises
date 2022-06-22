import java.util.Scanner;

public class Main2310 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int totalService = 0;
    int totalBlocks = 0;
    int totalAttacks = 0;
    int totalServiceS = 0;
    int totalBlocksS = 0;
    int totalAttacksS = 0;
    for (int i = 0; i < n; i++) {
      String name = in.nextLine();
      in.nextLine();
      totalService += in.nextInt();
      totalBlocks += in.nextInt();
      totalAttacks += in.nextInt();
      totalServiceS += in.nextInt();
      totalBlocksS += in.nextInt();
      totalAttacksS += in.nextInt();
    }

    double servicesPer = 100.0 * totalServiceS/totalService;
    double blocksPer = 100.0 * totalBlocksS/totalBlocks;
    double attacksPer = 100.0 * totalAttacksS/totalAttacks;

    System.out.printf("Pontos de Saque: %.2f %%.\n", servicesPer);
    System.out.printf("Pontos de Bloqueio: %.2f %%.\n", blocksPer);
    System.out.printf("Pontos de Ataque: %.2f %%.\n", attacksPer);
  }
}
