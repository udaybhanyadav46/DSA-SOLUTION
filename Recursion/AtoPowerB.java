package Recursion;

public class AtoPowerB {

  public static int firstWay(int a, int b) {
    if (b == 0) {
      return 1;
    }
    int smallProblem = firstWay(a, b - 1);
    return a * smallProblem;
  }

  public static int secondWay(int a, int b) {
    if (b == 1) {
      return a;
    }
    int smallProblem = secondWay(a, b / 2);
    if (b % 2 == 0) {
      return smallProblem * smallProblem;
    } else {
      return smallProblem * smallProblem * a;
    }
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    // ans sholud be 3^2 =9
    System.out.println(firstWay(a, b));
    System.out.println(secondWay(a, b));
  }
}
