import java.util.*;
public class digitsprint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0){
            int digit = num % 10;
            System.out.println(digit); // yahan pe print likhne se reverse ho jayega
            num = num/10;
        }
        
    }
}
