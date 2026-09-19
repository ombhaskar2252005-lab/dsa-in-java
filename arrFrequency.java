import java.util.*;
//hashmap ka use karenge
public class arrFrequency {
    static void findfrequency(int arr[]){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i =0; i<arr.length; i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i], 0)+1);
        }
        for (int key : freqMap.keySet()) {
    System.out.println(key + " -> " + freqMap.get(key));
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        findfrequency(arr);
        sc.close();
    }
}
