public class XorInRange {

  public static int firstWay(int n) {
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans = ans ^ i;
    }
    return ans;
  }

  public static int secondWay(int n) {
    if (n % 4 == 1) {
      return 1;
    } else if (n % 4 == 2) {
      return n + 1;
    } else if (n % 4 == 3) {
      return 0;
    } else {
      return n;
    }
  }

  public static void main(String[] args) {

    // Question 1 Find Xor in Given Range n=3 then find 1^2^3
    int n = 3;

    // Apporach 1 use for loop and perform xor operaton
    System.out.println(firstWay(n));

    // Apporach 2 use pattern
    System.out.println(secondWay(n));

    // Question 2 Find Xor in Given Range left=3 right= 7
    // then find 3^4^5^6^7
    int left = 3;
    int right = 7;
    int ZeroToLeft_One = secondWay(left - 1);
    int ZeroToRight = secondWay(right);
    int result = ZeroToLeft_One ^ ZeroToRight;
    System.out.println(result);

  }
}
