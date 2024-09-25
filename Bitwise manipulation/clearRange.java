public class clearRange {
    public static void main(String[] args) {
        System.out.println(clearIthRange(10, 2, 4));
    }
  public static int clearIthRange(int n,int i,int j){
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask =a|b;
    return n & bitMask;
  }

}
