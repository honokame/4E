class IllegalArgementException extends Exception{
  IllegalArgementException(String s){super(s);}
}

class HundredException extends Exception{
  HundredException(String s){super(s);}
}

public class Exception113{
  public static void main(String[] args){
    int data1 = 0,data2 = 0;
    
    // 正常時実行 
    try{
      // String型からint型に変換
      data1 = Integer.parseInt(args[0]); 
      data2 = Integer.parseInt(args[1]);

      // 除数が0 割れない時
      if(data2 == 0){
        System.out.println("エラー：除数が0");
      }

      // 割れる時
      else{
        System.out.println(division(args[0],args[1]));
      }
    }

    // 引数が足りない時
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("引数を与えてください");
    }

    // 引数が数値以外の時
    catch(NumberFormatException e){
      System.out.println("引数に数を指定してください");
      System.out.println(e.getMessage());
    }
    catch(IllegalArgementException e){
      System.out.println(e.getMessage());
    }
    catch(HundredException e){
      System.out.println(e.getMessage());
    }
  }


// 商を求める
static int division(String a,String b) throws IllegalArgementException,HundredException{
  int data1 = 0,data2 = 0;

  // String型からint型に変換
  data1 = Integer.parseInt(a);
  data2 = Integer.parseInt(b);
  if(data2 == 10)throw(new IllegalArgementException("10だけは受け付けません"));
  if(data2 == 100)throw(new HundredException("独自例外:"+data2));
  return data1 / data2;
}

}






































































