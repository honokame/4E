public class SolveQE{
  public static void solveQE(int a,int b,int c){
    double x1,x2,d;
    d = Discriminant.discriminant(a,b,c);
    if(d > 0){
       x1 = (-b + Math.sqrt(d)) / (2 * a);
       x2 = (-b - Math.sqrt(d)) / (2 * a);
       System.out.println("解：x =" + x1 + "," + x2);
    }
    else if(d == 0){
      x1 = (-b + Math.sqrt(d)) / (2 * a);
      System.out.println("解：x =" + x1);
    }
    else{
      System.out.println("実数解は存在しません");
    }
  }
}
