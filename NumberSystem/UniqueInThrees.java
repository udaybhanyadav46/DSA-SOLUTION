public class UniqueInThrees {

  public static int secondWay(int arr[]) {
    int one = 0;
    int two = 0;

    for (int i = 0; i < arr.length; i++) {
      one = (one ^ arr[i]) & ~two;
      two = (two ^ arr[i]) & ~one;
    }
    return one;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 9, 3, 3, 3, 2, 2, 2 };
    int ans = 0;
    for (int bitIndex = 0; bitIndex < 32; bitIndex++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (((arr[j] >> bitIndex) & 1) == 1) {
          count++;
        }
      }
      if (count % 3 == 1) {
        ans = (ans | (1 << bitIndex));
      }
    }
    System.out.println(ans);

    System.out.println(secondWay(arr));
  }
}
