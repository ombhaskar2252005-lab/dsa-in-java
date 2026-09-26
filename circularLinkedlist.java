public class circularLinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public circularLinkedlist(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void inseratHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail = newNode;
            tail.next = head; //circular connection
        }
        else{
            newNode.next = head;
            head = newNode;
            //circular connection
            tail.next = head;
        }
        size++;
    }
    public void printlist() {
    if(head == null) {
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    do {
        System.out.print(temp.data + "-->");
        temp = temp.next;
    } while(temp != head);

    System.out.println();
}
    public static void main(String[] args) {
        circularLinkedlist  mylist = new circularLinkedlist();
        mylist.inseratHead(10);
        mylist.inseratHead(76);
        mylist.inseratHead(43);
        mylist.printlist();
    }
}
