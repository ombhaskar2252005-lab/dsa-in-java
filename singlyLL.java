// import java.util.*;
public class singlyLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //data members
    private Node head;
    private Node tail;
    private int size;
    // empty constructor
    public singlyLL(){
    this.head= null;
    this.tail = null;
    this.size = 0;
    }
    // inserting the node at the beginning of linkedlist
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        // condition for empty node 
        if(head==null && tail == null){
            head = newNode;
            tail = newNode;
        }
        //for existing node
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    // inserting the new value at end of node
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if (head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    // inserting at the given position
    public void insertAtPosition(int position, int data){
        if(position<1 || position>size+1){
            //insertion is not possible because position not exist
            System.out.println("not possible");
            return;
        }
        // at start
        if(position==1){
            insertAtHead(data);
            return;
        }
        // at end
        if(position == size+1){
            insertAtTail(data);
            return;
        }
        // at any middle position
        Node prevNode = head;
        for(int i=1; i<=position-2;i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }
    
    public boolean search(int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data==target){
                return true;
            }
            else{
            temp = temp.next;
        }
    }
    return false;
    }
    public int findposition(int target){
        Node temp = head;
        int position=1;
        while(temp!=null){
            if(temp.data==target){
                return position;
            }
            else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }
    //update the vale at given position
    public void updatePosition(int position, int newdata){
        Node temp = head;
        // take temp to the position given in input
        for(int i = 1; i<=position-1; i++){
            temp = temp.next;
        }
        //ab mera temp, exact position wali node par hai
        //replace old data with new data
        temp.data = newdata;
    }
    public void deleteHead(){
        if(head==null){
            System.out.println("Linked List is empty, cannot delete anything");
            return;
        }
        //main logic
        head = head.next;
        size--;
        // be cautious check whether after deletion ll has become empty or not
        if(head == null){
            tail = null;
        }
    }
    public void deletetail(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        if(head ==tail){ //iska matlab ek hi node ha list me
            head = null;
            tail = null;
            size =0;
            return;
        }
        Node temp = head;
        for(int i=1; i<=size-2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    // Traversal or print krne ke liye
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        singlyLL mylist = new singlyLL();
        if(mylist.isEmpty()){
            System.out.println("List is empty");
        }
        // list ke head me new value
        mylist.insertAtHead(10); // empty list me value put kiye
        mylist.insertAtHead(20);
        mylist.insertAtHead(30);
        mylist.printlist();

        //list ke end me value
        mylist.insertAtTail(5);
        mylist.printlist();

        // value at any position
        mylist.insertAtPosition(2, 25);
        mylist.printlist();
        // searching
        // mylist.search(20);
        System.out.println("found the target: " + mylist.search(10));
        System.out.println("found the target: " + mylist.search(9));
        
        System.out.println("The position is: " + mylist.findposition(10));
        mylist.updatePosition(2, 35);
        mylist.printlist();
        mylist.deleteHead();
        mylist.printlist();

        mylist.deletetail();
        mylist.printlist();
        
    }
}
