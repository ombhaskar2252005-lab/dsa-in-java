import java.util.*;
public class arraybasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array: ");
        int n = sc.nextInt();
        int arr[] = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 5;
        arr[4] = 1;
        System.out.println(arr[1]);
        // for loop use krke array print
        int array[] = {52,87,23,14};
        int m = array.length;
        for(int j = 0; j<m; j++){
            System.out.println(array[j]);
        }
        //input of array
        int arr1[] = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("enter the value of index " + i);
           arr1[i] = sc.nextInt();
        }
        for(int val: arr1){
            System.out.print(val +" "); //for loop bhi use kr shakte same hi rahega upar wale loop ke jaisa
        }
        sc.close();
    }
}
