import java.util.*;
public class aset {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(5);
        num.add(9);
        num.add(9);
        System.out.println(num); //duplicate ko print nhi krta ha
System.out.println(num.contains(2));
    }
}
