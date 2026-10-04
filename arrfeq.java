import java.util.*;
public class arrfeq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        int count =0;
        for(int i =0; i<n; i++){
            if(arr[i]==x){
                count++;
            }
        }
        if(count==0){
            System.out.println("Not Found");
        }
        else{
            System.out.println(count);
        }
        sc.close();
    }
}
