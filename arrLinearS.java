import java.util.*;
public class arrLinearS {
    static boolean linearsearch(int arr[],int target){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("elements of array: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int target = sc.nextInt();  
        boolean result = linearsearch(arr, target);
        System.out.println(result);
        sc.close();
  }
}
