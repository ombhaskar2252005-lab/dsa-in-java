public class ImpSinglyll {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null; //each linked list object needs its own head reference
    // insert at head method
    void insertAtHead(int data){
        Node newnNode = new Node(data);
        newnNode.next = head;
        head = newnNode;
    }
    // insert at end method 
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head; 
        // temp is a temporary reference used to travel through the list. 
        // We use it so that head continues pointing to the first node.

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display(){ // isi ko traversal kehte ha 
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // reverse ka ss dekh lena
    public static void main(String[] args) {
        ImpSinglyll list = new ImpSinglyll();
        list.insertAtHead(20);
        list.insertAtHead(10);  
        list.insertAtHead(5); 
        list.insertAtEnd(30);
        list.display();
    }
}
