import java.util.*;
public class RowMajor2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row no: ");
        int r = sc.nextInt();
        System.out.println("Enter column no: ");
        int c = sc.nextInt();
        System.out.println("enter array: ");
        int arr[][] = new int[r][c];
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Row-Major order: ");
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println("\nColumn-major order: ");
        for(int j =0; j<c; j++){
            for(int i =0; i<r; i++){
                System.out.print(arr[i][j] + " ");
            }
        }
        sc.close();
    }
}
