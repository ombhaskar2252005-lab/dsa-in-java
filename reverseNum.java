import java.util.*;
public class reverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int origin = num;
        int rev = 0;
        while(num != 0){ 
            int digit = num%10;
            rev = rev*10+digit;
            num = num /10;
        }
        // if(origin == rev){
        // System.out.println("palindrome");
        // }
        // else{
        //     System.out.println("not");
        // }
        System.out.println(rev);
        sc.close();
    }
}
