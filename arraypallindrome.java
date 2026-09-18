import java.util.*;
public class arraypallindrome {
    static void arrpallindrome(int arr[]){
        int start = 0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("Not a palindrome");
                return;  // exit immediately, don't check further
            }
        start++;
        end--;
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter a array: ");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        arrpallindrome(arr);
        
        sc.close();
    }
}
