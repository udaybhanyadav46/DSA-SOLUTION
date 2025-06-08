package LINKEDLIST;

import java.util.LinkedList;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

}

public class ReverseLList {
  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    ListNode next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  public static void print(LinkedList<Integer> lis) {
    for (int i = 0; i < lis.size(); i++) {
      System.out.print(lis.get(i) + " ");
    }
    System.out.println();
  }

  public static void reverse(LinkedList<Integer> list) {
    int s = 0;
    int e = list.size() - 1;
    while (s < e) {
      int start = (int) list.get(s);
      int end = (int) list.get(e);

      list.set(s, end);
      list.set(e, start);

      s++;
      e--;
    }
  }

  public static void main(String[] args) {

    LinkedList<Integer> lis = new LinkedList<>();
    lis.add(10);
    lis.add(20);
    lis.add(30);
    lis.add(40);
    lis.add(50);

    print(lis);
    reverse(lis);
    print(lis);
  }
}
