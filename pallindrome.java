public class pallindrome {
    public static void main(String[] args){
      String s = "Hello  c olleH";
      int i =0; 
      int j = s.length()-1;
      while(i<j){
        while((i<j) && s.charAt(i) == ' '){
            i++;
        }
        while((i<j) && s.charAt(j) == ' '){
            j--;
        }
        if(s.charAt(i) != s.charAt(j)){
            System.out.println("Not a palindrome");
            return;
        }
        i++;
        j--;
      }
      System.out.println("Palindrome");

        }
      }
      
    

