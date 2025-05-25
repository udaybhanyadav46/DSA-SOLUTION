package Recursion;

public class BinarySearch {

  public static int BinarySearchHelper(int a[], int s, int e, int target) {
    if (s > e) {
      return -1;
    }
    int mid = s + (e - s) / 2;
    if (a[mid] == target) {
      return mid;
    } else if (a[mid] > target) {
      return BinarySearchHelper(a, s, mid - 1, target);
    } else {
      return BinarySearchHelper(a, mid + 1, e, target);
    }
  }

  public static int BinarySearch(int a[], int target) {
    return BinarySearchHelper(a, 0, a.length - 1, target);

  }

  public static void main(String[] args) {
    int a[] = { 1, 1, 3, 3, 4, 7 };
    int target = 7;
    System.err.println(BinarySearch(a, target));
  }
}
