import java.util.Scanner;
public class Equation{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("2次方程式 ax^2 + bx + c に対して、整数a,b,cを入力してください");
    a = Int.parseInt(scan.next());
    b = Int.parseInt(scan.next());
    c = Int.parseInt(scan.next());
    Discriminant(a,b,c);
    SolveQE(a,b,c);
  }

  static int Discriminant(int a,int b,int c){
    int a,int b,int c
