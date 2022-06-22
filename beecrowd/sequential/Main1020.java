import java.util.Scanner;

public class Main1020 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int daysLived = in.nextInt();
    int temp = daysLived;
    int years = temp / 365;
    temp %= 365;
    int months = temp / 30;
    temp %= 30;
    int days = temp; 
    System.out.println(years + " ano(s)");
    System.out.println(months + " mes(es)");
    System.out.println(days + " dia(s)");
  }
}
