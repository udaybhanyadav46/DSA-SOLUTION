package Array;
import java.util.Arrays;

public class SetMismatch {

  public static int[] firstWay(int nums[]) {

    int result[] = new int[2];
    int sum = 0;

    // logic to find duplicate number
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i - 1]) {
        result[0] = nums[i];
        break;
      }
    }

    // logic to find missing number
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    int n = nums.length;
    int expectedSum = (n * (n + 1)) / 2;
    result[1] = expectedSum - (sum - result[0]);

    return result;
  }

  public static void main(String[] args) {
    // Letcode 645. Set Mismatch
    int arr[] = { 1, 5, 3, 2, 2, 7, 6, 4, 8, 9 };
    int result[] = firstWay(arr);
    }
}
