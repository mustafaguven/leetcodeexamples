package cses._01_Weird_Algorithm;

public class WeirdAlgorithm {

  public static void main(String[] args) {
    var wa = new WeirdAlgorithm();
    wa.solution2(3);
  }

  private void solution(int n) {
    System.out.println(n);
    if (n == 1) return;
    if (n % 2 == 0) {
      solution(n / 2);
    } else {
      solution((n * 3) + 1);
    }
  }

  private void solution2(int n) {
    var max = Math.pow(10, 6);
    while (n != 1 && n < max) {
      System.out.println(n);
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = (n * 3) + 1;
      }
    }
  }
}
