import java.lang.Math
public class SolveQE{
  public static void solveQE(int a,int b,int c){
    double x1,x2,d;
    d = Discriminant.discriminant(a,b,c); // 判別式の値をdに代入
    x1 = (-b + sqrt(d)) / (2 * a);
    x2 = (-b - sqrt(d)) / (2 * a);

    // 解が2つ
    if(d > 0){
       System.out.println("解：x =" + x1 + "," + x2);
    }

    // 解が1つ
    else if(d == 0){
      System.out.println("解：x =" + x1);
    }

    // 実数解が存在しない
    else{
      System.out.println("実数解は存在しません");
    }
  }
}
