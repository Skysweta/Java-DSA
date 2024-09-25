public class power {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(10));
    }
  public static boolean powerOfTwo(int n){
   
    return( n & (n-1))==0;
  }
}
