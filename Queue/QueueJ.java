// implementation of queue using java frameworks


import java.util.*;

public class QueueJ {
    // queue is a interface it is implemented using either linkedlist or Arraydeque
    public static void main (String args[]){
       // Queue<Integer> q = new LinkedList<>();
       Queue<Integer> q = new ArrayDeque<>(); //ArrayDeque

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }

    }

    


    
}
