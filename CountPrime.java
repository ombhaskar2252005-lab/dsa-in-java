import java.util.*;
public class CountPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int num = 2; num<=n; num++){
            boolean prime = true;
            for(int i = 2; i*i<= num; i++){
                if(num%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
                // System.out.println(num);
            }
           
        }
        System.out.println(count);
        sc.close();
    }
}