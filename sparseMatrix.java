import java.util.*;
public class sparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =4;
        int m = 4;
        int cnt =0; // count how many non zero are present in matrix
        int num[][] = new int[n][m];
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                num [i][j] = sc.nextInt();
                if(num[i][j] != 0){
                    cnt++;
                }
            }
        } 
        int sm[][] = new int[3][cnt]; // 3 is for row number, column and value
        int k =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(num[i][j] !=0){
                    sm[0][k] = i;
                    sm[1][k] = j;
                    sm[2][k] = num[i][j];
                    k++;
                }
            }
        }
        System.out.println();
        for(int i=0; i<3; i++){
            for(int j=0; j<cnt; j++){
                System.out.print(sm[i][j] + " ");
            }
            System.out.println("");
        }
        
}
}
