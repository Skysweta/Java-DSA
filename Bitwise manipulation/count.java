// here we will count no of set bits ina number

public class count {
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
  public static int countSetBits(int n){
    int count = 0;
    while(n>0){
        if((n&1) != 0){ // check LSB
            count++;
        }

       n=n>>1;
    }
   
    return count;
  }
}
