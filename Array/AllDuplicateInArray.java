package Array;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicateInArray {
  // Apporach 1 Using HashMap

  // Apporach 2
  /*
   * 4,3,2,7,8,2,3,1
   * here we use nums[index value -1] because value range 1 to n and we don't have
   * nums[n]
   * let suppose nums[4-1]=nums[3]=5 , and we chanege it -5
   * and again if we find 4 then nums[4-1] alrady will be -5 beacause we set
   * update it before
   * 
   */
  public static List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int val = Math.abs(nums[i]);
      if (nums[val - 1] < 0) {
        ans.add(val);
      } else {
        nums[val - 1] = -nums[val - 1];
      }
    }
    System.out.println(ans);
    return ans;
  }

  public static void main(String[] args) {
    // 442. Find All Duplicates in an Array
    int arr[] = { 4, 3, 2, 7, 8, 2, 1 ,5};
    findDuplicates(arr);
  }
}
