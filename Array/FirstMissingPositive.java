package Array;

import java.util.Arrays;

public class FirstMissingPositive {

  // *********** Time Limit Exceeded ****************
  public static int firstWay(int nums[]) {
    if (nums.length == 1 && nums[0] == 1) {
      return 2;
    }
    int result = nums.length;
    int pc = 0;

    for (int i = 1; i <= nums.length; i++) {
      boolean inrange = false;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == i) {
          inrange = true;
          pc++;
          break;
        }
      }
      if (!inrange) {
        result = i;
        break;
      }
    }
    return pc == nums.length ? result + 1 : result;
  }

  // ****************** Accepted *********************
  public static int secondWay(int nums[]) {
    Arrays.sort(nums);
    int tn = 1;
    if (nums[0] == tn) {
      tn++;
    }
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] <= 0) {
        continue;
      }

      else if (nums[i] == tn) {
        tn++;
      } else if (nums[i] != nums[i - 1]) {
        return tn;
      }

    }
    System.out.println((tn));
    return tn;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2 };
    System.out.println(firstWay(arr));
  }
}
