package BinarySearch;

class PivotIndex {

  public static int pivotIndex(int[] nums) {
    int left = 0;
    int sum = 0;
    int index = -1;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      sum = sum - nums[i];
      if (left == sum) {
        index = i;
        break;
      }
      left += nums[i];
    }
    return index;
  }

  public static void main(String[] args) {
    // 724. Find Pivot Index
    int nums[]={1,7,3,6,5,6};
    int result=pivotIndex(nums);
    System.out.println(result);
  }
}