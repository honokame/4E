public class matrix{
  public static void main(String[] args){ // 行列の引数
    // 入力された行列を表示する
    System.out.println("入力された行列は");
    System.out.print(args[0] + "\t" + args[1] + "\n" + args[2] + "\t" + args[3]  + "\n");    
    
    double [] matrix = new double[3];
    for(int i = 0;i < 3;i++){
      matrix[i] = args[i];
    }

    double frac = 1 / ((matrix[0] * matrix[3]) - (matrix[1] * matrix[2]));
    double[] imatrix = new double[3];
    imatrix[0] = frac * matrix[3];
    imatrix[1] = frac * matrix[1] * -1;
    imatrix[2] = frac * matrix[2] * -1;
    imatrix[3] = frac * matrix[0];
    System.out.print(imatrix[0] + "\t" + imatrix[1] + "\n" + imatrix[2] + "\t" + imatrix[3]  + "\n");    
  }
}
