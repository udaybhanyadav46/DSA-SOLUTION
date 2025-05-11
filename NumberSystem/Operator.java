class Operator {
  public static void main(String[] args) {

    // Check i th bit is set or not
    int a = 5;
    int i = 1;
    boolean check = ((a >> i) & 1) == 1;
    System.out.println(" 1 th bit of 5 is set or not = " + check);

    // Set i th bit
    int number = 4;
    int position = 1;
    int result = (number | (1 << position));
    System.out.println(result);

    // Clear i th bit
    int num = 7;
    int pos = 1;
    int resu = (num & (~(1 << i)));
    System.out.println(resu);

    // Get 1 th bit
    int n = 5;
    int p = 1;
    int r = ((n >> p) & (1));
    System.out.println("The " + i + " th bit of " + n + " is: " + r);

    // Update i th bit
    int nu = 5;
    int po = 1;
    int re = (nu ^ (1 << po));
    System.out.println(re);
  }
}