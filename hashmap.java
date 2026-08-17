import java.util.*;

public class hashmap {
    public static void main (String args[]){
       // HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,7 );
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println(map.getOrDefault(5,1));
        int arr[] = {1,2,3,2,1,7};
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        System.out.println(map);
    }
    
}
