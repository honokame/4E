public class Mikuji83 {
    public static void main(String[] args){
        try{
            if(mikuji(args[0])){ 
                System.out.println("あたり");
            }else{
                System.out.println("はずれ");
            } 
        }catch(NumberFormatException e){
            System.out.println("引数に数を指定してください。");
        }
    }
    static boolean mikuji(String s){
        int number;
        number = Integer.parseInt(s);  
        return (number == 7);      // number と 7 が等しければ true,
    }                             // 等しくなければ false が返る`
}

