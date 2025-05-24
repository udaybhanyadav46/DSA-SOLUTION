package BinarySearch;

public class FirstAndLastPositionOfElement {

  public static int firstOccuerence(int arr[], int targert) {
    int result = -1;
    int s = 0;
    int e = arr.length - 1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == targert) {
        result = mid;
        e = mid - 1;
      } else if (arr[mid] > targert) {
        e = mid - 1;
      } else {
        s = mid + 1;
      }
    }

    return result;
  }

  public static int lastOccuerence(int arr[], int targert) {
    int result = -1;
    int s = 0;
    int e = arr.length - 1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == targert) {
        result = mid;
        s = mid + 1;
      } else if (arr[mid] > targert) {
        e = mid - 1;
      } else {
        s = mid + 1;
      }
    }

    return result;
  }

  public static int[] firstWay(int nums[], int target) {
    int result[] = new int[2];
    result[0] = firstOccuerence(nums, target);
    result[1] = lastOccuerence(nums, target);
    return result;
  }

  public static void main(String[] args) {
    // 34. Find First and Last Position of Element in Sorted Array
    int arr[] = { 5, 7, 7, 8, 8, 10 }, target = 7;
    int a = firstOccuerence(arr, target);
    int b = lastOccuerence(arr, target);
    System.out.print(a + " " + b);
  }

}
