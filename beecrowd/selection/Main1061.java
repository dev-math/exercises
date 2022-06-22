import java.util.Scanner;

public class Main1061 {
  static Scanner in = new Scanner(System.in);

  static int[] strArr2Int(String[] str) {
    int arrInt[] = new int[str.length];
    for (int i = 0; i < str.length; i++) {
      arrInt[i] = Integer.parseInt(str[i]);
    }
    return arrInt;
  }

  static String[] getTime() {
    String[] dayStr = in.nextLine().split(" ");
    String time = in.nextLine();
    String str = dayStr[1] + " : " + time;
    String[] strSplited = str.split(" : ");
    return strSplited;
  }

  static int[] calcTime(int[] startTime, int[] endTime) {
    int days = endTime[0] - startTime[0];
    int hours = endTime[1] - startTime[1];
    int minutes = endTime[2] - startTime[2];
    int seconds = endTime[3] - startTime[3];
    int[] totalTime = { days, hours, minutes, seconds };

    for (int i = totalTime.length - 1; i >= 0; i--) {
      if (totalTime[i] < 0) {
        totalTime[i] = (i == 1) ? (totalTime[i] + 24) : (totalTime[i] + 60);
        totalTime[i - 1]--;
      }
    }

    return totalTime;
  }

  public static void main(String[] args) {
    int[] startTime = strArr2Int(getTime());
    int[] endTime = strArr2Int(getTime());
    int[] totalTime = calcTime(startTime, endTime);
    System.out.println(totalTime[0] + " dia(s)");
    System.out.println(totalTime[1] + " hora(s)");
    System.out.println(totalTime[2] + " minuto(s)");
    System.out.println(totalTime[3] + " segundo(s)");
  }
}
