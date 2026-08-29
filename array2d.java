public class array2d {
    public static void main(String[] args) {
        // int arr[][] = new int[2][2];
        int arr[][]={
            {1,2},
            {3,8},
            {9,7},
        };
        System.out.println(arr[0][1]); //accessing the value
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
