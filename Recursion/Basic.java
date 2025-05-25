package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Basic {
  public static int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    int smallProbleam = factorial(n - 1);
    return smallProbleam * n;
  }

  public static int fibonaciSerires(int n) {
    if (n == 0) {
      return 0;

    } else if (n == 1) {
      return 1;
    }
    int firstPart = fibonaciSerires(n - 1);
    int secondPart = fibonaciSerires(n - 2);
    int result = firstPart + secondPart;
    return result;
  }

  public static int sumOfFirstNaturalNumber(int n) {
    if (n == 1) {
      return 1;
    }
    int smallProbleam = sumOfFirstNaturalNumber(n - 1);
    int result = n + smallProbleam;
    return result;
  }

  public static void printOneTon(int n) {
    if (n == 1) {
      System.out.print(1 + " ");
      return;
    }
    printOneTon(n - 1);
    System.out.print(n + " ");
  }

  public static void printNToOne(int n) {
    if (n == 1) {
      System.out.println(1 + " ");
      return;
    }
    System.out.print(n + " ");
    printNToOne(n - 1);
  }

  public static String reverse(String s, String result) {
    if (s.length() == 0) {
      return result;
    }
    result += s.charAt(s.length() - 1);
    return reverse(s.substring(0, s.length() - 1), result);
  }

  public static boolean isPliandrome(String s) {
    String reverse = reverse(s, "");
    return s.equals(reverse);
  }

  public static double powerOfNumber(double x, int n) {
    if (n == 0) {
      return 1;
    }
    double smallProbleam = powerOfNumber(x, n / 2);
    if (n % 2 == 0) {
      return smallProbleam * smallProbleam;
    } else {
      return smallProbleam * smallProbleam * x;
    }
  }

  public static int countNoOfDigit(int n) {
    if (n / 10 == 0) {
      return 1;
    }
    int smallProblem = countNoOfDigit(n / 10);
    return 1 + smallProblem;
  }

  public static int sumOfDigit(int n) {
    if (n / 10 == 0) {
      return n;
    }
    int smallProblem = sumOfDigit(n / 10);
    return smallProblem + n % 10;
  }

  public static int GCD(int n1, int n2) {
    int result = 0;
    if (n1 == 0) {
      return n2;
    } else if (n2 == 0) {
      return n1;
    }
    while (n2 != 0) {
      int temp = n2;
      n2 = n1 % n2;
      n1 = temp;
    }
    return n1;
  }

  public static int GCD2(int n1, int n2) {
    int result = 0;
    if (n1 == 0) {
      return n2;
    } else if (n2 == 0) {
      return n1;
    }
    return GCD2(n2, n1 % n2);
  }

  public static int MultiplyOfTwoNumber(int n1, int n2) {
    if (n2 == 1) {
      return n1;
    }
    int smallProblem = MultiplyOfTwoNumber(n1, n2 - 1);
    return smallProblem + n1;
  }

  public static boolean isArraySortedHelper(int arr[], int index) {
    if (index == arr.length) {
      return true;
    }
    if (arr[index] < arr[index - 1]) {
      return false;
    }
    return isArraySortedHelper(arr, index + 1);
  }

  public static boolean isArraySorted(int arr[]) {
    return isArraySortedHelper(arr, 1);
  }

  public static int maximumElementInArrayHelper(int num[], int index, int result) {
    if (index == num.length) {
      return result;
    }
    if (num[index] > result) {
      result = num[index];
    }
    int smallProblem = maximumElementInArrayHelper(num, index + 1, result);
    return smallProblem;
  }

  public static int maximumElementInArray(int num[]) {
    if (num.length == 1) {
      return num[0];
    }
    return maximumElementInArrayHelper(num, 0, num[0]);
  }

  public static void printAllSubsetOfStringHelper(String s, int index, List<String> list, String current) {
    if (index == s.length()) {
      list.add(current);
      return;
    }
    printAllSubsetOfStringHelper(s, index + 1, list, current);
    printAllSubsetOfStringHelper(s, index + 1, list, current += s.charAt(index));
  }

  public static void printAllSubsetOfString(String s) {
    List<String> list = new ArrayList<>();
    printAllSubsetOfStringHelper(s, 0, list, "");
    System.out.println(list);
  }

  public static void main(String[] args) {
    // // 1. Factorial
    // System.out.println(factorial(5));

    // // 2. Nth Fibonacci Number
    // System.out.println(fibonaciSerires(5));

    // // 3. Sum of first N natural numbers
    // System.out.println(sumOfFirstNaturalNumber(5));

    // // 4. Print numbers from 1 to N
    // printOneTon(5);

    // // 5. Print numbers from N to 1
    // System.out.println();
    // printNToOne(5);

    // 6. Reverse a string
    // System.out.println(reverse("abc", ""));

    // // 7. Check if a string is a palindrome
    // System.out.println(isPliandrome("abx"));

    // // 8. Power of a number pow (2,3), should be 8
    // System.out.println(powerOfNumber(2, 10));

    // // 9.Count digits of a number
    // System.out.println(countNoOfDigit(123));

    // // 10. Sum of digits of a number
    // System.out.println(sumOfDigit(1235));

    // // 11. Greatest Common Divisor (GCD)
    // System.out.println(GCD2(12, 26));

    // // 12. Multiply two numbers recursively (without using * operator)
    // System.out.println(MultiplyOfTwoNumber(2,6));

    // //13. Check if array is sorted
    // System.out.println(isArraySorted(new int[] { 1, 2, 3, 4,4 }));

    // // 14. Find the maximum element in an array
    // System.out.println(maximumElementInArray(new int[] { 28, 4, 3, 1 }));

    // 15. Print all subsets of a string
    printAllSubsetOfString("abc");
  }

}
