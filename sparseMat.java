import java.util.*;
public class sparseMat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int zero = 0;
        int nonzero =0;
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0){
                    zero++;
                }
                else{
                    nonzero++;
                }
            }
        }
        //checking it is sparse matrix or not
        if(zero>nonzero){
            System.out.println("The matrix is a sparse matrix.");
        }
        else{
            System.out.println("The matrix is not a sparse matrix.");
        }
        // display of matrix
        System.out.println("The matrix is: ");
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}