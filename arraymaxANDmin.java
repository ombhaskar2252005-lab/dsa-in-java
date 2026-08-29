import java.util.*;
public class arraymaxANDmin {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
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
        //int max = arr[0][0];
        int min = arr[0][0];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }     
    }
}
System.out.println("Minimum value = " + min);
sc.close();
}
}