 public class basicmethod {
//     static void print2table(){
//         for(int i =0; i<= 10; i++){
//             System.out.println(2*i);
//         }
//     }
    
//     public static void main(String[] args) {
//         System.out.println("hi");
//        print2table();
//     }

static void printsum(int x, int y){
    System.out.println("Sum: " + (x + y));
}
public static void main(String[] args){
    printsum(87,98);
    int result=add(13, 8);
    System.out.println(result);
}
static int add(int a, int b){
    int sum = a+b;
    return sum;
}
 }