public class power2 {
    public static int optimizedpow(int x,int n){

        if(n==0){
         return 1;
        }

        int halfPower=optimizedpow(x, n/2);
         int halfPowerSq =  halfPower*halfPower;
         //n is odd
         if(n%2 != 0){
            halfPowerSq=x*halfPowerSq;
         }

         return halfPowerSq;
     }



    public static void main(String args[]) {
      
     System.out.println (optimizedpow(2,5));
}
}
