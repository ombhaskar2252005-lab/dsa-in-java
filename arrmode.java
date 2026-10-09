import java.util.*;
public class arrmode {
    public static int getmode(int arr[]){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maxcount = 0;
        int mode =arr[0];
        for(int num:arr){
            freq.put(num, freq.getOrDefault(num, 0) +1);
            if(freq.get(num)>maxcount){
                maxcount = freq.get(num);
                mode=num;
            }
        }
        return mode;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         int result = getmode(arr);
        System.out.println("the mode is: " + result);
        sc.close();
    }
}
