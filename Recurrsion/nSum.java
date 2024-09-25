public class nSum {
    
    public static int nSum(int n){

        if(n==1){
         return 1;
        }
         int Snm1 =nSum(n-1);// snm1 = is fact n minus 1
         int sn = n+Snm1;
         return sn;
     }



    public static void main(String args[]) {
        int n = 5;
     System.out.println (nSum(n));
}
}
