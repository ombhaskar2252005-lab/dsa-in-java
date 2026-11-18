public class recursion1 {
    static void takenum(int n){
        if(n == 0){
            return;
        }
        takenum(n-1);
        System.out.println("hello " + n);
    }
    public static void main(String[] args) {
        takenum(5);
    }
}
