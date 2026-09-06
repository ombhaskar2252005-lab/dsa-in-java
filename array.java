import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,8,10,7,9};
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            ans=Math.min(ans,arr[i]);
        }
        System.out.println(ans);
        //average of array
        int sum =0;
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the array: ");
        int arr1[] = new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }
        double avg = sum/2;
        System.out.println("The avg is " + avg);
        sc.close();
    }
}
