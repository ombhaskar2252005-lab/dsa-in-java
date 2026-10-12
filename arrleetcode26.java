// 2 Pointer technique used here
import java.util.*;
public class arrleetcode26 {
    public static int removeduplicates(int arr[]){
        int n = arr.length;
        int i =0; 
        int j=0; 
        while(j<n){
            if(arr[i]== arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i+1;  // ye unique values ka count return karega
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result = removeduplicates(arr);
        for (int k = 0; k < result; k++) {
            System.out.println(arr[k] + " ");
        }
        System.out.println("The length of the array after removing duplicates is: " + result);
        sc.close();
    }

}
