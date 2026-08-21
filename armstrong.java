import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int originalNO = n;
        while(n!=0){
            int digit = n%10;
            int cube = digit*digit*digit;
            sum = sum +cube;
            n = n/10;
        }
        if(sum == originalNO){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       sc.close();
    }
}
