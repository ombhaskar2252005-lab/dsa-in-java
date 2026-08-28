import java.util.*;

public class amap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(2, 3);
        map.put(4, 6);
        map.put(6, 9);
        map.put(8, 1);
        for(Map.Entry<Integer,Integer> point: map.entrySet()){
            System.out.println(point.getKey()+"-->"+point.getValue());
        }
        System.out.println(map);
    }
}
