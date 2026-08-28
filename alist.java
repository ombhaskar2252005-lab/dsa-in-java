import java.util.ArrayList;

public class alist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(20);
        list.add(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
