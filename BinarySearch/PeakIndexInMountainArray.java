package BinarySearch;

public class PeakIndexInMountainArray {

  public static int firstWay(int arr[]) {
    int s = 0;
    int e = arr.length - 1;
    while (s < e) {
      int m = s + (e - s) / 2;
      if (arr[m] > arr[m + 1]) {
        e = m;
      } else {
        s = m+1;
      }
    }

    return s;
  }

  public static void main(String[] args) {
    int arr[] = { 0, 1, 0 };
    int ans = firstWay(arr);
    System.out.println(ans);
  }
}
