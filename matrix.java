public class matrix{
  public static void main(double[] args){ // 行列の引数
    // 入力された行列を表示する
    System.out.println("入力された行列は");
    System.out.print(args[0] + "\t" + args[1] + "\n" + args[2] + "\t" + args[3]  + "\n");    
    
    double frac = 1 / ((args[0] * args[3]) - (args[1] * args[2]));
    double[] imatrix = new double[3];
    imatrix[0] = frac * args[3];
    imatrix[1] = frac * args[1] * -1;
    imatrix[2] = frac * args[2] * -1;
    imatrix[3] = frac * args[0];

  }
}
