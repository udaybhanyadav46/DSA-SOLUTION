public class MinBitFlipToConNum {
  public static void main(String[] args) {
    int num = 5; // 101
    int goal = 7; // 111
    int count = 0;

    // Step 1 num ^goal
    int helper = num ^ goal;

    // Step 2 Count Set Bit helper
    while (helper > 0) {
      if ((helper & 1) == 1) {
        count++;
      }
      helper = helper >> 1;
    }
    System.out.println(count);
  }
}
