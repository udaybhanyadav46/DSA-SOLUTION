package Recursion;

public class LinearSearch {
  public static int linearSearchHelper(int arr[], int index, int target) {
    if (index == arr.length) {
      return -1;
    }
    if (arr[index] == target) {
      return index;
    }
    return linearSearchHelper(arr, index + 1, target);
  }

  public static int linearSearch(int arr[], int target) {
    return linearSearchHelper(arr, 0, target);
  }

  public static void main(String[] args) {
    // Search an element in array using recursion
    int a[] = { 1, 2, 1, 3, 7, 3, 4, 2 };
    int target = 3;
    System.out.println(linearSearch(a, target));
  }
}
