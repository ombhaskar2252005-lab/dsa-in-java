import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        System.out.println("Enter the number to search:");
        int tar = sc.nextInt();
        int n = arr.length;
        for(int i=0; i<n; i++ ){
            if(arr[i] == tar){
                System.out.println("present");
                return;
            }
        }
        System.out.println("not present");
        sc.close();

    }
}
