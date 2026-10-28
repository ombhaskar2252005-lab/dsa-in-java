public class StackByArr {
    int[] arr;
    int top;
    int size;
    StackByArr(int size){ //parameter constructor
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == size - 1;
    }
    void push(int value){
        if(top == size -1){
            System.out.println("Stack overflow");
            return;
        }
        top ++;
        arr[top] = value;
    }
    int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1; //stops the method if empty
        }
        int value = arr[top];
        top--;
        return value;
    }
    int peek(){
        if (top == -1){
            System.out.println("Stack empty");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(top == -1){
            System.out.println("Stack empty");
            return;
        }
        for (int i =top; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackByArr s = new StackByArr(5);
        s.push(10);
        s.push(20);
        s.push(25);
        s.push(30);
        s.push(40);
        System.out.println("Stack : ");
        s.display();
       // s.push(50); stack overflow kyuki 5 element se jada ha
        s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        // s.pop();
        System.out.println("After removing top: ");
        s.display();
        // s.pop(); underflow batayega
        System.out.println("top element: " + s.peek());
    }
}
