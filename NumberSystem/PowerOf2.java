public class PowerOf2 {
  public static void main(String[] args) {
    int num=11;
    boolean result=(num &(num-1))==0;
    System.out.println(result);
  }
}
