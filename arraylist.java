import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("om");
        name.add("rahul");
        name.add("disha");
        name.add("sumi");
        System.out.println(name);
        System.out.println(name.get(1));
        System.out.println("love " + name.get(3));
        System.out.println(name.set(1, "deepika")); //rahul ke jagah deepika ayega
        System.out.println(name.remove(2));
        System.out.println(name.size());
        System.out.println(name.contains("sumi"));
        System.out.println(name);
    }
}
