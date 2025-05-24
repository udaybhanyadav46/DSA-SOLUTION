package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  // ************** first Way O(n^2) ***************
  public static int[] firstWay(int nums[], int target) {
    int ans[] = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }

  // *********** Second Way O(nlogn) **************
  // this is one solution but it will not accepeted by leetcode
  // because we changed tha index during sorting
  public static int[] secondWay(int nums[], int target) {
    Arrays.sort(nums);
    int ans[] = new int[2];
    int i = 0;
    int j = nums.length - 1;
    while (i <= j) {
      if (nums[i] + nums[j] == target) {
        ans[0] = i;
        ans[1] = j;
      } else if (nums[i] + nums[j] < target) {
        i++;
      } else {
        j--;
      }
    }
    return ans;
  }

  // ************ Third way t.c O(n)*************
  public static int[] thirdWay(int nums[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int helper = target - nums[i];
      if (map.containsKey(helper)) {
        return new int[] { map.get(helper), i };
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {

    int nums[] = { 2, 7, 11, 15 };
    int target = 91;
    int result[] = thirdWay(nums, target);
    System.out.println(result[0]);
    System.out.println(result[1]);

  }
}
