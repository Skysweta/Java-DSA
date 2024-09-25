// check if a number is odd or even
// for odd -> LSB is 1
// for even -> LSB is 0
//here & operator will be used



public class oddEven{

    public static void oddOrEven(int n){
        int bitMask=1;
        if((n& bitMask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }

    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(12);
    }
}