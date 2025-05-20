package Array;

public class FindTheDifference {
  public static char findTheDifference(String s, String t) {
    int s1 = 0;
    int s2 = 0;
    for (int i = 0; i < s.length(); i++) {
      s1 += (int) s.charAt(i);
    }
    for (int i = 0; i < t.length(); i++) {
      s2 += (int) t.charAt(i);
    }
    char ans = (char) ((s2 - s1));
    return ans;
  }

  // using bitwise operator
    public char findTheDifference2(String s, String t) {
        int xor = 0;
        for (int i = 0; i < s.length(); i++) {
            xor ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            xor ^= t.charAt(i);
        }
        return (char) xor;
    }

  public static void main(String[] args) {
    // Letcode 389. Find the Difference
    String s = "abcd", t = "abcde";
    System.out.println(findTheDifference(s, t));
  }
}
