public class staircase {
    public static int possibleways(int n){
        if (n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int step1 = possibleways(n-1);
        int step2 = possibleways(n-2);
        return step1 +step2;
    }
    public static void main(String[] args) {
        int n =3;
        int ways = possibleways(3);
        System.out.println(ways);
    }
}
