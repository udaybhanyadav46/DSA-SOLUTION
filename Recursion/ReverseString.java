package Recursion;

public class ReverseString {

  public static String reverseStringHelper(String s, String result, int index) {
    if (index == 0) {
      result += s.charAt(0);
      return result;
    }
    result += s.charAt(index);
    return reverseStringHelper(s, result, index - 1);
  }

  public static String reverseString(String s) {
    return reverseStringHelper(s, "", s.length() - 1);
  }

  public static void main(String[] args) {
    String s = "abcds";
    System.out.println(reverseString(s));
  }
}
