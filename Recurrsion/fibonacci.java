public class fibonacci {
    
    public static int fib(int n){

        if(n==1|| n==0){
         return n;
        }
         int fibnm1 =fib(n-1);
         int fibnm2 = fib(n-2);
         int fibn = fibnm1 + fibnm2;
         return fibn;
     }


    public static void main(String args[]) {
        
     System.out.println (fib(4));
   }
}
