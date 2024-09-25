
public class linkedList {

   //*************CREATE NODE ********************* */

    public static class Node{
        int data;
        Node next;
         
        public Node(int data){
            this.data=data;
            this.next=null; 
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

//***********ADD FIRST********************* */


    public void addFirst(int data){ // tc -O(1)
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;//link

        //step3 - head = newNode
        head = newNode;
    }

//***********ADD lAST********************* */

    public void addLast(int data){ //tc - O(n)
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - tail next = newNode
        tail.next = newNode;//link

        //step3 - tail = newNode
        tail = newNode;
    }

    //***********PRINT********************* */

    public void print(){ // tc-O(n )
        if(head == null){
            System.out.println("LL is empty");
            return; 
        }
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

//***********ADD ANY INDEX********************* */


    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
//*************REMOVE FIRST********************* */

public int removeFirst(){
    if(size ==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail =null;
        size=0;
        return val;

    }
    int val =head.data;
    head = head.next;
    size--;
    return val;
}


//**************REMOVE LAST********************* */

public int removeLast(){
    if(size ==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail =null;
        size=0;
        return val;

    }

    //prev :i =size-2
    Node prev = head;
    for(int i=0;i<size-2;i++ ){
        prev = prev.next;
    }
    int val =prev.next.data;//tail.data
    prev.next=null;
    tail = prev;
    size--;
    return val;
}


//**************SEARCH********************* */


public int itrSearch(int key){ //O(n)
    Node temp = head;
    int i=0;

    while(temp != null){
        if(temp.data == key){ //key found
            return i;
        }

        temp = temp.next;
        i++;
    }

    //key not found

    return -1;
}



public int helper(Node head, int key) { //O(n)
    if(head == null){
        return -1;
    }

    if(head.data == key){
        return 0;
    }

    int idx = helper(head.next,key);
    if(idx == -1){
        return -1;
    }

    return idx+1;
}


public int recSearch(int key){
    return helper(head,key);
}

//**************Reverse LL ********************* */

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;


        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }

        head=prev;
    }
//**************DeleteNth Node From End ********************* */

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp =head;
        while(temp != null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;  //removeFirst
            return;
        }

        //sz-n
        int i=1;
        int itoFind =sz-n;
        Node prev =head;
        while(i < itoFind){
            prev = prev.next;
            i++;

        }

        prev.next=prev.next.next;
        return;

    }
    //**************check if linkedlist is palindrome or not ********************* */
    //slow-fast Approach
    public Node findMid(Node head){ //helper
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next !=null){
            slow=slow.next; //+1
            fast = fast.next.next; //+2

        }

        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 -find mid
        Node miNode = findMid(head);

        //step-2 reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;

        }

        Node right = prev ;//right half head
        Node left = head;


        //step3 - chck left half & right half

        while(right !=null){
            if(left.data != right.data){
                return false;
            }

            left=left.next;
            right=right.next;

        }

        return true;
    }


    //***************Main function******************** */

    public static void main(String[] args) {
        linkedList ll = new linkedList();
       
        // ll.addFirst(2);
      
        // ll.addFirst(1);
        
        ll.addLast(1);
        
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        // ll.add(2, 9);
     
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.size);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(11));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthfromEnd(3);

        ll.print();
        System.out.println(ll.checkPalindrome());
        
    }
}