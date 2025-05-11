public class CountSetBit {
  public static void main(String[] args) {
    int n = 7;
    int count = 0;
    if (n == 1) {
      count = 1;
    }
    while (n > 0) {
      count += n & 1;
      n = n >> 1;
    }
    System.out.println("No of set Bit in is : " + count);

    // apporach 2
    int n2=7;
    int count2 = 0;
    while (n2 > 0) {
      n2 = (n2 & (n2 - 1));
      count2++;
    }
    System.out.println("No of set Bit in is : " + count2);

  }
}
