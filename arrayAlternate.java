import java.util.*;
public class arrayAlternate {
    static void alternate(int arr[]){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            if(start==end){
                System.out.print(arr[start] + " ");
                return;
            }
            else{
                //i<j case
                System.out.print(arr[start] + " ");
                start++;
                System.out.print(arr[end] + " ");
                end--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        alternate(arr);
        sc.close();
    }
}
