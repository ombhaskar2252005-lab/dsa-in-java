import java.util.*;
public class arrmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = sc.nextInt();
        int mul = 1;
        int sum =0;
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            mul *= arr[i];
            sum = sum +arr[i];
        }
        System.out.println(mul);
        System.out.println(sum);
        sc.close();
    }
}
