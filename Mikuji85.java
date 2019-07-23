class MyException extends Exception{
  MyException(String s){super(s);}
}

public class Mikuji85{
  public static void main(String[] args){
    
    // 正常時実行
    try{
      if(mikuji(args[0])){ // mikujiメソッドにとぶ
        System.out.println("あたり");
      }
      else{
        System.out.println("はずれ");
      } 
    }
    
    // 例外処理1 引数がない
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("引数を与えてください。");	 
    }
    
    // 例外処理2 引数が数字でない
    catch(NumberFormatException e){
      System.out.println(e.getMessage());
      // System.out.println("引数に数を指定してください。");
    }
    
    // 例外処理3 独自例外
    catch(MyException e){
      System.out.println(e.getMessage());
    }
  }
  
  static boolean mikuji(String s) throws MyException{ // 例外処理3にとぶ
    int number;
    number = Integer.parseInt(s); // string型からint型に変換
    if(number == 8) throw (new NumberFormatException("8 だけは受け付けません。")); // 例外処理2にとぶ
    if(number == 9) throw (new MyException("独自例外:" + number + "。")); // 例外処理3にとぶ
    return (number == 7); // numberが7ならtrue、それ以外ならfalseを返す
  }                             
}

