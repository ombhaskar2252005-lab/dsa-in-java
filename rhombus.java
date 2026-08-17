public class rhombus {
    public static void main(String args[]){
        int n =5;
        for (int i = 0; i<=n; i++){
            //spaces
            for(int k=0; k<=n-i; k++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
