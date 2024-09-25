

public class arr {
    public static void changeArr(int array[],int i ,int val){
        //base case
        if(i==array.length){
            printArr(array);
            return;
        }
        //recursion
        array[i] = val;
        changeArr(array, i+1, val+1);
        array[i]=array[i]-2;

    }


    public static void printArr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] = new int[5];
        changeArr(array,0,1);
        printArr(array);

    }
}
