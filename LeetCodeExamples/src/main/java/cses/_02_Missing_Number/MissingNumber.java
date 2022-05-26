package cses._02_Missing_Number;

import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {
    int n = 8;
    var array = new Integer[] {2, 5, 4, 1, 6, 7, 8};
    solution(n, Arrays.stream(array).mapToInt(i -> i).toArray());
  }

  private static void solution(int n, int[] arr) {
    //total should be below by the consecutive numbers law
    var total = (n * (n + 1) / 2);
    for (int number : arr) {
      total -= number;
    }
    System.out.println(total);
  }
}
