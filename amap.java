import java.util.*;
public class amap {
    public static void main(String[] args) {
        HashMap<Integer,String> ids = new HashMap<>();
        ids.put(2, "om");
        ids.put(4, "harsh");
        ids.put(6, "love");
        ids.put(8, "love"); //isme duplicate value bhi ho shakte ha
        // for(Map.Entry<Integer,String> point: ids.entrySet()){
        //     System.out.println(point.getKey()+"-->"+point.getValue());
        // }
        System.out.println(ids);
        System.out.println(ids.get(2));
        System.out.println(ids.containsKey(6));
        System.out.println(ids.containsValue("om"));
    }
}
