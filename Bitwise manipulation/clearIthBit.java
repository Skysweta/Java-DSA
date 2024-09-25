//here we want clear i.e make 0 at the ith position
// for firstly, we have to ~(1<<i)
// then n& ~(1<<i)

public class clearIthBit {
    public static void main(String[] args) {
        System.out.println(clearBit(10,1 ));
    }

    public static int clearBit(int n , int i){
        int bitMask= ~(1<<i);
        return n& bitMask;
    }
}
