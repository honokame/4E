import java.util.Scanner;
public class InputOutput01{
  public static void main(String[] args){
    double data1,data2,division;
    Scanner scan = new Scanner(System.in);
    System.out.println("一つ目の整数を入力してください");
    data1 = scan.nextDouble(); // 浮動小数点を1つ読み取りdouble型を返す
    System.out.println("二つ目の整数を入力してください");
    data2 = scan.nextDouble(); // 浮動小数点を1つ読み取りdouble型を返す
    division = data1 / data2;
    System.out.printf("%6.3f + %6.3f = %6.3f(小数点表記),%6.3e(指数表記)\n",data1,data2,division,division);
    scan.close(); // スキャナを閉じる
  }
}
