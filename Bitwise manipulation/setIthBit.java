// here we want set at ith position of the number
// n|(1<<i) will perform


public class setIthBit {
    public static void main(String[] args) {
        System.out.println(setBit(10,2 ));
    }


    public static int setBit(int n ,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

}

// input = 1010
// output = 1110 = 2^3+2^2+2^1 = 14
