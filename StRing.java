import java.util.*;
public class StRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "bHaSkar";
        String str = "bhasKar";
        System.out.println(word.charAt(4));
        System.out.println(word.length());
        System.out.println(word.toUpperCase());
System.out.println(word.toLowerCase());
System.out.println(word.equals(str));

System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println(str1);
sc.close();
    }
}
