class IllegalArgementException extends Exception{
  IllegalArgementException(String s){super(s);}
}

class HundredException extends Exception{
  HundredException(String s){super(s);}
}
public class Exception111{
  public static void main(String[] args){
    try{
      System.out.println(division(args[0],args[1]));
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("引数を与えてください");
    }
    catch(NumberFormatException e){
      System.out.println("引数に数を指定してください");
    }
    catch(IllegalArgementException e){
      System.out.println(e.getMessage());
    }
    catch(HundredException e){
      System.out.println(e.getMessage());
    }
  }

  static int division(String a,String b) throws IllegalArgementException,HundredException{
    int data1,data2;
    data1 = Integer.parseInt(a);
    data2 = Integer.parseInt(b);
    if(data2 == 10)throw(new IllegalArgementException("10だけは受け付けません"));
    if(data2 == 100)throw(new HundredException("独自例外:"+data2));
    return data1 / data2;
  }
}

/*
class IllegalArgementException extends Exception{
  IllegalArgementException(String s){super(s);}
}

class HundredException extends Exception{
  HundredException(String s){super(s);}
}*/
