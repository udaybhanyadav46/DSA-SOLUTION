import java.util.*;

public class PowerSet {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 5 }; // numOfSet will be 8
    List<List<Integer>> list = new ArrayList<>();
    int numOfSet = 1 << arr.length;

    for (int i = 0; i < numOfSet; i++) {
      List<Integer> innerLsit = new ArrayList<>();
      for (int j = 0; j < arr.length; j++) {
        if (((i >> j) & 1) == 1) {
          innerLsit.add(arr[j]);
        }
      }
      list.add(innerLsit);
    }
  }
}
