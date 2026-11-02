// queue implementation using array
public class queue {
    int arr[] = new int[5];
    int front = 0;
    int rear = -1;
    public void enqueue(int data){
        if(rear == arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = data;
    }
    public int dequeue(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = arr[front];
        front++;
        if(front >rear){
            front =0;
            rear =-1;
        }
        return removed;
    }
    public int peek(){
        if(rear == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    public boolean isFull(){
        return rear == arr.length-1;
    }
    public int size(){
        if(rear == -1){
            return 0;
        }
        return rear - front + 1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Front element: " + q.peek());
        System.out.println("Size of queue: " + q.size());
    }
}
