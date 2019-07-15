class MyException extends Exception{
    MyException(String s){super(s);}
}

public class Mikuji85 {
    public static void main(String[] args){
        try{
            if(mikuji(args[0])){ 
                System.out.println("あたり");
            }else{
                System.out.println("はずれ");
            } 
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("引数を与えてください。");	 
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("引数に数を指定してください。");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    static boolean mikuji(String s) throws MyException{
        int number;
        number = Integer.parseInt(s);  
        if(number == 8) throw (new NumberFormatException("8 だけは受け付けません。"));
        if(number == 9) throw (new MyException("独自例外:" + number + "。"));
        return (number == 7);      // number と 7 が等しければ true,
    }                             // 等しくなければ false が返る`
}

