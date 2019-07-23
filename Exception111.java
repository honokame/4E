public class Exception111{
  public static void main(String[] args){
    int data1 = 0,data2 = 0;
    try{
      data1 = Integer.parseInt(args[0]);
      data2 = Integer.parseInt(args[1]);
      if(data2 == 0){
        System.out.println("エラー：除数が0");
      }
      else{
        System.out.println(division(data1,data2));
      }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("引数を与えてください");
    }
    catch(NumberFormatException e){
      System.out.println("引数に数を指定してください");
      System.out.println(e.getMessage());
    }
  }

  static int division(int a,int b){
    return a / b;
  }
}
