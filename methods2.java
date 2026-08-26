public class methods2 {
    static void printlevel(){
        System.out.println("hello, world");
    }
    static int sum(int a, int b){
        return a+b;
    }
    static boolean voteEligible(int age){
        return age >= 18;
    }
    public static void main(String[] args){
        printlevel();
        int addition = sum(81, 21);
        System.out.println("Addition " + addition);
        boolean eligible = voteEligible(19);
        System.out.println(eligible);
    }
}
