package Array;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateInArray {

  // Apporach 1. Hashmap
  public static int firstWay(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    int ans = 0;
    for (Integer i : map.keySet()) {
      if (map.get(i) == 2) {
        ans = i;
        break;
      }
    }
    return ans;

  }

  // Apporach 2. Sort the Array
  public static int secondWay(int arr[]) {
    Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        return i;
      }
    }
    return -1;
  }

  // Apporach 3 usnig Xor Bitwise
  public static int thirdWay(int arr[]) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      ans = ans ^ arr[i];
    }
    for (int i = 1; i < arr.length; i++) {
      ans = ans ^ i;
    }
    return ans;
  }

  public static void main(String[] args) {
    // 287. Find the Duplicate Number
    int arr[] = { 1, 3, 4, 2, 2 };
    System.out.println(firstWay(arr));
    System.out.println(secondWay(arr));
    System.out.println(thirdWay(arr));
  }
}
