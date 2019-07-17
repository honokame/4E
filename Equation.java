import java.util.Scanner;
public class Equation{
  public static void main(String args[]){
    int a,b,c;
    Scanner scan = new Scanner(System.in);
    System.out.println("二次方程式 ax^2 + bx + c に対するa,b,cを入力してください");
    a = Integer.parseInt(scan.next()); 
    b = Integer.parseInt(scan.next()); 
    c = Integer.parseInt(scan.next());
    System.out.println("判別式は" + Discriminant.discriminant(a,b,c));
    SolveQE.solveQE(a,b,c);
  }
}
