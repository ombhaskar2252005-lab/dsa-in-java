import java.util.*;
public class arrayUnsorted {
    static int getunsorted(int arr[]){
        for(int i =1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = getunsorted(arr);
        System.out.println(result);
        sc.close();
    }
}
