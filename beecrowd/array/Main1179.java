import java.util.Scanner;

public class Main1179 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] even = new int[5];
    int[] odd = new int[5];
    int nEven = 0;
    int nOdd = 0;

    for (int i = 0; i < 15; i++) {
      int x = in.nextInt();
      if (x % 2 == 0) {
        if (nEven == 5) {
          nEven = 0;
          printArr(even, 5, "par");
        }
        even[nEven] = x;
        nEven++;
      } else {
        if (nOdd == 5) {
          nOdd = 0;
          printArr(odd, 5, "impar");
        }
        odd[nOdd] = x;
        nOdd++;
      }
    }

    printArr(odd, nOdd, "impar");
    printArr(even, nEven, "par");
  }

  static void printArr(int[] arr, int end, String arrName) {
    for (int i = 0; i < end; i++) {
      System.out.println(arrName + "[" + i + "] = " + arr[i]);
    }
  }
}
