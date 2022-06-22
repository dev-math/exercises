import java.util.Scanner;

public class Main1828 {
  static String[] choices = { "pedra", "Spock", "papel", "lagarto", "tesoura" };

  static double mod(int a, int b) {
    double c = a % b;
    return (c < 0) ? (c + b) : c;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    in.nextLine();
    for (int i = 0; i < t; i++) {
      String[] play = in.nextLine().split(" ");
      System.out.println("Caso #" + (i + 1) + ": " + sheldonReaction(play[0], play[1]));
    }
  }

  public static int indexOfArray(String[] array, String key) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(key)) {
        return i;
      }
    }
    return -1;
  }

  static String sheldonReaction(String opt1, String opt2) {
    int choiceOne = indexOfArray(choices, opt1);
    int choiceTwo = indexOfArray(choices, opt2);

    if (choiceOne == choiceTwo) {
      return "De novo!";
    } else if (mod(choiceOne - choiceTwo, choices.length) < choices.length / 2.0) {
      return "Bazinga!";
    } else {
      return "Raj trapaceou!";
    }
  }
}
