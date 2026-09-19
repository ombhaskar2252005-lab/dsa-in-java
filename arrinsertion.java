import java.util.*;
public class arrinsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a position: ");
        int pos = sc.nextInt();
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        for(int i =n; i>pos; i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        n++;
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    } 
}
