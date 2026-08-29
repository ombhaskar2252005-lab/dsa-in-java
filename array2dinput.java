import java.util.*;
public class array2dinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the number of row: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of col: ");
        int m = sc.nextInt();
        int arr[][]= new int[n][m]; 
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                System.out.println("Enter the row " + i + " column " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                  System.out.print(arr[i][j] + " ");
                  sum = sum +arr[i][j];
    }
    System.out.println();
}
 System.out.println("the sum of array is:  " + sum);
sc.close();
 }
}
