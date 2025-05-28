package Recursion;

public class BubbleSort {

  // Iterative approach
  public static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  // Recursive Apporach
  public static void bubbleSortRecHelper(int arr[], int e) {

    if (e == 0) {
      return;
    }
    for (int i = 0; i < e; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = temp;
      }
    }
    bubbleSortRecHelper(arr, e - 1);
  }

  public static void bubbleSortRec(int arr[]) {
    bubbleSortRecHelper(arr, arr.length - 1);
  }

  public static void p(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 2, 1, 4, 3, 2,1 };
    p(arr);
    bubbleSortRec(arr);
    p(arr);
  }
}
