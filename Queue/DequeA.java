import java.util.*;
public class DequeA {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque); 

        System.out.println("first el =" + deque.getFirst());
        System.out.println("last el =" + deque.getLast());

        


        
    }
    
}
