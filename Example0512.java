import java.util.Scanner;
public class Example0512{
  public static void main(String[] args){
    int data1,data2;
    double division;
    String stringDivision;
    System.out.println("二つの整数を入力してください");
    Scanner scan = new Scanner(System.in);
    data1 = Integer.parseInt(scan.next()); // string型からint型に変換
    data2 = Integer.parseInt(scan.next()); // string型からint型に変換
    division = data1 / data2;
    stringDivision = String.valueOf(division); // int型からstring型に変換
    System.out.println(data1 + "/" + data2 + "=" + stringDivision + "です");
  }
}
