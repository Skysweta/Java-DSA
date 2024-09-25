
//here we will use bitmask((-1)<<i) ,then we will perform & with n

public class clearLastIth {
    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 2));
    }

    public static int clearIthBit(int n , int i){
        int bitMask =(~0)<<i;
        return n & bitMask;
    }
}
