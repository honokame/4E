public class Mikuji81 {
    public static void main(String[] args){
        if(mikuji(args[0])){ 
            System.out.println("あたり");
        }else{
            System.out.println("はずれ");
        } 
    }
    static boolean mikuji(String s){
        int number;
        number = Integer.parseInt(s);  
        return (number == 7);      // number と 7 が等しければ true,
    }                             // 等しくなければ false が返る`
}
