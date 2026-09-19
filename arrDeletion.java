import java.util.*;
public class arrDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("enter array: ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the position to delete: ");
        int pos = sc.nextInt();
        for(int i =pos; i<n-1; i++){
            arr[i]=arr[i-1];
        }
        n--;
        System.out.println("Final array is: ");
        for(int i=0; i<n; i++ ){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
