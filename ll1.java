public class ll1 {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
    }
    public Node insertAtStart(Node head, int data){
        Node n1 = new Node(data);
        n1.next = head;
        head = n1;
        return head;
    }
    public void insertAtEnd(Node head, int data){
        Node n2 = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n2;
    }
    public Node insertAtindex(int val, Node head, int pos){
        if(pos<=0){
            System.out.println("Invalid index");
            return head;
        }
        if(head == null && pos>1){
            System.out.println("Linked list is empty and position is out of reach");
            return null;
        }
        if(pos == 1){
            return insertAtStart(head, val);
        }
        Node temp = head;
        for(int i =0; temp != null && i<pos-1; i++){
            temp = temp.next;
        }
        if(temp== null){
            System.out.println("Reached at the end of the linkedlist and position is out of reach");
            return head;
        }
        Node nn = new Node(val);
        nn.next = temp.next;
        temp.next = nn;
        return head;
    }

    public static void main(String[] args){
        ll1 list = new ll1();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        Node n1 = list.insertAtStart(head, 50);
        list.print(n1);
        System.out.print("null");
       
        System.out.println();
        list.insertAtEnd(head, 4);
        list.print(head);
        System.out.print("null");
        System.out.println();

        head = list.insertAtindex(25, head, 3);
        list.print(head);
        System.out.println("null");
    }
}
