package Array;

import java.util.*;

public class ThreeSum {

  // ************ Fist way ****************
  // This is one solution but T.C = O(n³) , so it will not wrok for big array
  // note -> If you are trying to store one list inside another list and want to
  // handle
  // duplicate then Use HashSet<List<Integer>> and Collections.sort(list) before
  // storing into set
  public static List<List<Integer>> threeSum(int[] nums) {
    int n = nums.length;
    Set<List<Integer>> mainlist = new HashSet<>();
    for (int i = 0; i <= n - 3; i++) {
      for (int j = i + 1; j <= n - 2; j++) {
        for (int k = j + 1; k <= n - 1; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(list);
            mainlist.add(list);
          }
        }
      }
    }
    return new ArrayList<>(mainlist);
  }

  // *********** Second Way    O(n²)  ******************
  public static List<List<Integer>> secondWay(int nums[]) {
    int n = nums.length;
    Set<List<Integer>> mainlist = new HashSet<>();
    // map.put(0, 0);
    for (int i = 0; i <= n - 3; i++) {
      HashSet<Integer> set = new HashSet<>();
      for (int j = i + 1; j <n ; j++) {
        int target = 0 - (nums[i] + nums[j]);
        System.out.println("target " + target);
        if (set.contains(target)) {
          List<Integer> list = Arrays.asList(nums[i], nums[j], target);
          Collections.sort(list);
          mainlist.add(list);
          System.out.println(mainlist);
        } else {
          set.add(nums[j]);
        }
      }
    }
    return new ArrayList<>(mainlist);
  }

  public static void main(String[] args) {
    // 15. 3Sum
    int nums[] = { -1, 0, 1, 2, -1, -4 };
    int nums2[] = { 0, 1, 1 };
    int nums3[] = { -1, 0, 1 };
    List<List<Integer>> ans = secondWay(nums3);
    System.out.println(ans);
  }
}
