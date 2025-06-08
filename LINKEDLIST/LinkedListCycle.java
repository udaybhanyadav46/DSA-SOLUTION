package LINKEDLIST;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LinkedListCycle {

  public boolean recursion(ListNode slow, ListNode fast) {

    if (fast == null || fast.next == null) {
      return false;
    }
    slow = slow.next;
    fast = fast.next.next;
    if (slow == fast) {
      return true;
    }
    return recursion(slow, fast);
  }

  public boolean UsingMap(ListNode head) {
    if (head == null) {
      return false;
    }
    Map<ListNode, Boolean> map = new HashMap<>();
    ListNode t = head;
    while (t != null) {
      if (map.get(t) != null) {
        if (map.get(t) == true) {
          return true;
        }
      }
      map.put(t, true);
      t = t.next;
    }
    return false;
  }

  public boolean iterative(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    // return UsingMap(head);
    // return iterative(head);
    return recursion(slow, fast);
  }

  public static void main(String[] args) {
    // 141. Linked List Cycle
    // Given head, the head of a linked list, determine if the linked list has a
    // cycle in it.
  }
}