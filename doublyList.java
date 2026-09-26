public class doublyList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //data members
    private Node head;
    private Node tail;
    private int size;

    doublyList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head ==null && tail ==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next = head;
            head.prev=newNode;
            head = newNode;
        }
        size++;
    }
    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null && tail ==null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void deleteHead(){
        if(head==null){
            System.out.println("no delete");
            return;
        }
        //single node
        if(head==tail){
            head = null;
            tail = null;
            return;
        }
        //more than 1 node
        head = head.next;
        head.prev = null;
        size--;
    }

    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        doublyList mylist = new doublyList();
        mylist.insertAtHead(10);
        mylist.printlist();
        mylist.insertAtHead(20);
        mylist.insertAtHead(30);
        mylist.insertAtHead(50);
        mylist.printlist();
        mylist.insertAtTail(100);
        mylist.printlist();
        mylist.deleteHead();
        mylist.printlist();
        // mylist.deleteHead();
        // mylist.printlist();
    }
}
