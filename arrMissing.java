import java.util.*;
public class arrMissing {
    static int missingnum(int arr[]){
        int n = arr.length;
        int sum = (n*(n+1))/2;
        int add =0;
        for(int i =0; i<n; i++){
            add = add +arr[i];
        }
        int num = sum - add;
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result = missingnum(arr);
        System.out.println("Missing number: " + result);
        sc.close();
    }
}
