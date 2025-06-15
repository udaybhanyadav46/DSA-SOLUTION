import java.util.Stack;

public class SortStack {
  public static void insertAtCorrectPosition(Stack<Integer> s, int e) {
    if (s.isEmpty() || s.peek() <= e) {
      s.push(e);
      return;
    }
    int cur = s.pop();
    insertAtCorrectPosition(s, e);
    s.push(cur);
  }

  public static void sort(Stack<Integer> s) {
    if (s.isEmpty()) {
      return;
    }
    int curr = s.pop();
    sort(s);
    insertAtCorrectPosition(s, curr);
  }

  public static void print(Stack<Integer> s) {

    while (!s.isEmpty()) {
      System.out.print(s.pop() + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(30);
    s.push(80);
    s.push(10);
    s.push(40);
    sort(s);
    print(s);
  }
}
