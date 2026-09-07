import java.util.*;
public class arrMax {
    static int max(int arr[]){
        int max = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum number is: "+max(arr));
        sc.close();
    }
}
