public class Exception111{
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
        System.out.println(division(data1,data2));
      }
    }

    // 例外処理1 引数が足りない時
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("引数を与えてください");
    }

    // 例外処理2 引数が数値以外の時
    catch(NumberFormatException e){
      System.out.println("引数に数を指定してください");
      System.out.println(e.getMessage());
    }
  }
　
  // 商を求める
  static int division(int a,int b){
    return a / b;
  }
}
