package Array;

import java.util.*;

public class UniqueNoOccurence {

  // Apporach 1. Sort the array
  public static boolean firstWay(int arr[]) {
    Arrays.sort(arr);
    int count[] = new int[arr.length];
    int index = 0;
    int c = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        c++;
      } else {
        count[index++] = c;
        c = 1;
      }
    }
    count[index++] = c;
    for (int i = 0; i < count.length; i++) {
      System.out.print(count[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < index; i++) {
      for (int j = i + 1; j < index; j++) {
        if (count[i] == count[j]) {
          return false;
        }
      }
    }
    return true;
  }

  // Apporach 2 Using HashMap
  public static boolean secondWay(int arr[]) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    return map.size() == new HashSet<Integer>(map.values()).size();
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 1, 1, 3, 4, 4, 4 };
    // System.out.println(firstWay(arr));
    System.out.println(secondWay(arr));
  }
}
