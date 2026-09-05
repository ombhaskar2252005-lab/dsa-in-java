public class stringQ1 {
    // static void printString(String str) {
    //     int n = str.length();
    //     for(int i =0; i<n; i++){
    //         System.out.println(str.charAt(i));
    //     }

    // static void stringreverse(String str){
    //     int n = str.length();
    //     for(int i = n-1; i>=0; i--){
    //         System.out.print(str.charAt(i));
    //     }

    // }

    static void stringpalindrome(String str){
        int n = str.length();
        String rev = "";
        for(int i = n-1; i>= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
    }
    
    public static void main(String[] args){
       // printString("JAVA");
       // stringreverse("JAVA");
       stringpalindrome("mom");

    }
}
