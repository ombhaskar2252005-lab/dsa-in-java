import java.util.*;
public class arrRishtshift{
    static void shift(int arr[]){
    int temp = arr[arr.length-1];
    for(int i= arr.length-1; i>0; i--){
        arr[i] = arr[i-1];
    }
    arr[0] = temp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    shift(arr);
    for(int i =0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}
