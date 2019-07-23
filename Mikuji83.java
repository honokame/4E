public class Mikuji83{
  public static void main(String[] args){
    if(mikuji(args[0])){ 
      System.out.println("あたり");
    }else{
      System.out.println("はずれ");
    } 
  }

  static boolean mikuji(String s){
    int number = 0;
    try{
      number = Integer.parseInt(s); // string型からint型に変換   
    }

    // 変換エラーが出た時
    catch(NumberFormatException e){
      System.out.println("引数に数を指定してください");
    }
    
    return (number == 7); // numberが7ならtrue、それ以外ならfalseを返す
  }
}
