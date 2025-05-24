package Array;

import java.util.HashSet;

public class IntersectionOfTwoArray {

  public static int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          set.add(nums1[i]);
        }
      }
    }
    return set.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    // 349. Intersection of Two Arrays
    int nums1[] = { 1, 2, 2, 1 };
    int nums2[] = { 2, 2 };
    int result[] = intersection(nums1, nums2);
  }

}
