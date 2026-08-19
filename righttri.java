// public class righttri {
//     public static void main(String aegs[]){
//         for(int i =0; i<5; i++){
//             for(int j =0; j<=i; j++){
//                 System.out.print(" *");

//             }
//             System.out.println();
//         }
        
//     }
// }
// invertede triangle
public class righttri{
    public static void main(String[] args){
        int n = 5;
        for(int i = n; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}