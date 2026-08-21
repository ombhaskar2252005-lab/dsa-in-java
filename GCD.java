import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = a*b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        int LCM = prod/ans;
        System.out.println(ans) ;
        System.out.println(LCM);
        sc.close();
    }      
}
