import java.util.*;
import java.lang.Math.*;
public class Ex51{
  public static void main(String[] args){ 
    double data1,data2,data3,result;
    System.out.println("3つの小数（小数点以下3桁以上）を入力してください。各数字は空白で区切ります。"); 
    Scanner scan = new Scanner(System.in); 
    data1 = Double.parseDouble(scan.next()); // string型からdoubleに変換
    data2 = Double.parseDouble(scan.next()); // string型からdoubleに変換
    data3 = Double.parseDouble(scan.next()); // string型からdoubleに変換
    result = max(data3,max(data1,data2)); // 最大値を求める
    System.out.printf("%fと%fと%fとで一番大きいのは%5.2fです\n",data1,data2,data3,result); 
  }
}
