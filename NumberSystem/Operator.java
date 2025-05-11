class Operator {
  public static void main(String[] args) {

    // Check i th bit is set or not
    int n = 5;
    int i = 1;
    boolean check = ((n >> i) & 1) == 1;
    System.out.println(" 1 th bit of 5 is set or not = " + check);

    // Set i th bit
    int n2 = 4;
    int i2 = 1;
    int result = (n2 | (1 << i2));
    System.out.println(result);

    // Clear i th bit
    int n3 = 7;
    int p3= 1;
    int resu = (n3 & (~(1 << p3)));
    System.out.println(resu);

    // Get 1 th bit
    int n4 = 5;
    int p4 = 1;
    int r = ((n4 >> p4) & (1));
    System.out.println("The " + i + " th bit of " + n + " is: " + r);

    // Update i th bit
    int n5 = 5;
    int p5 = 1;
    int r5 = (n5 ^ (1 << p5));
    System.out.println(r5);

    // remove last set bit 
    int n6=13;  // 1101 it should be 1100 -> here we do not have position
    // ex1  -> 111(7) , ex2 -> 1000(8)
    // n-1  -> 110             0111   
    // --------------------------------
    //n&(n-1)->110             0000
    int r6=n6 &(n6-1);
    System.out.println(r6);
  }
}