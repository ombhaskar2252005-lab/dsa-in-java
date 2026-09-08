import java.util.*;
public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> repeat = new HashMap<>();
        for(int i=0; i<n; i++){
            repeat.put(arr[i], repeat.getOrDefault(arr[i],0) +1);
        }
        System.out.println("How many number to search");
        int m = sc.nextInt();
        System.out.println("Enter " + m + " numbers");
        for(int i =0; i<m; i++){
            int num = sc.nextInt();
            int count = repeat.getOrDefault(num, 0);
            System.out.println(num + " appear " + count + " times in array.");
        }
        sc.close();
    }
}
