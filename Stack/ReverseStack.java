import java.util.*;

public class ReverseStack {

  public static void helper(Stack<Integer> s, int e) {
    if (s.isEmpty()) {
      s.push(e);
      return;
    }
    int curr = s.pop();
    helper(s, e);
    s.push(curr);

  }

  public static void reverse(Stack<Integer> s) {

    if (s.isEmpty()) {
      return;
    }
    int curr = s.pop();
    reverse(s);
    helper(s, curr);
  }

  public static void print(Stack<Integer> s) {

    while (!s.isEmpty()) {
      System.out.print(s.pop() + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    reverse(s);
    print(s);
  }
}
