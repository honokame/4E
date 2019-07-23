public class Exception111{
  public static void main(String[] args){
    //try{
    System.out.println(division(args[0],args[1]));
    /* }
       catch(ArrayIndexOutOfBoundsException e){
       System.out.println("引数を与えてください");
       }
       catch(NumberFormatException e){
       System.out.println("引数に数を指定してください");
       System.out.println(e.getMessage());

       }*/
  }

  static int division(String a,String b){
    int data1 = 0,data2 = 0;
    try{
      data1 = Integer.parseInt(a);
      data2 = Integer.parseInt(b);
    }
    catch(NumberFormatException e){
      System.out.println("引数に数字を指定してください");
      return 0;
    } if(data2 == 0){
      System.out.println("エラー：除数が0");
      return 0;
    }

    finally{
      return data1 / data2;
    }
    /*if(data2 == 0){
      System.out.println("エラー：除数が0");
      return 0;
    }*/
    return 0;

  }
}
