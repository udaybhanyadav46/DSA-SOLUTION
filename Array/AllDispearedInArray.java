package Array;

import java.util.ArrayList;
import java.util.List;

public class AllDispearedInArray {

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans = new ArrayList<>();

    // mark present elemet 
    boolean present[] = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
      present[nums[i]] = true;
    }

    // if element is false then it menas it is missing 
    for (int i = 1; i <= nums.length; i++) {
      if (present[i] == false) {
        ans.add(i);
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    // 448. Find All Numbers Disappeared in an Array
    int a[] = { 1, 1 };
    findDisappearedNumbers(a);
    // print(a);

  }
}
