

public class basic {
    


public static void  printn(int n){
  if(n==1){
    System.out.println(n);
    return ;
  }

  System.out.print(n+" ");
  printn(n-1);
}

  

public static void main(String args[]) {
    int n = 10;
    printn(10);

}




}
