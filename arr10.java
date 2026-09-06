import java.util.*;
public class arr10 {
    static void arrayMultiply(int[] arr){ 
        for(int i = 0; i<arr.length; i++){
            arr[i]= arr[i]*10; 
        }  //return yahan nhi ha kyuki new value return nhi krna ha
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arrayMultiply(arr);
        System.out.println("array multiply by 10: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
