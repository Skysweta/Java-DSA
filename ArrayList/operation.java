import java.util.*;

public class operation {

    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();

        // add operation
        list.add(1);  //O(1)
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        

        //Swap

        int idx1=1 , idx2 =3;
        System.out.println(list);

        swap(list, idx1 , idx2);

        System.out.println(list);
        // list.add(1,9);

        // System.out.println(list.size());

        //print the arrayList
        // find max
        // int max= Integer.MIN_VALUE;

        // for(int i=0;i<list.size(); i++){
        //     if(max<list.get(i)){
        //         max=list.get(i);
        //     }
           
        // }

        // System.out.println(max);
       

        // for(int i=list.size()-1;i>=0; i--){
        //     System.out.print(list.get(i) + " ");
        // }

        // Get operation  - O(1)
        // int element= list.get(2);
        // System.out.println(element);

        //Remove operation
        // list.remove(2);
        // System.out.println(list);


        // Set element at index
        // list.set(2,10);
        // System.out.println(list);

        //Contains 
        // System.out.println(list.contains(4));

    }
}
