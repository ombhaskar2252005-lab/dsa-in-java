import java.util.*;
public class primeNo {
    public static void main(String[] args){
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if (n%2 == 0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
        boolean isPrime = true;
        for(int i =2; i*i<=n; i++){
            if(n%i == 0 ){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }
            else{
                System.out.println("not prime");
            }
            sc.close();
        }
       
    }

