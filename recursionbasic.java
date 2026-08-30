public class recursionbasic {
    static void Greetthem(int count){
        System.out.println("hlo how are you");
        if(count<=1){
            return;
        }
        Greetthem(count-1);
       //  recurion me function ke andar hi method call hota ha
    }
    public static void main(String[] args) {
        Greetthem(10);
    }
}
