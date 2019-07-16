import java.util.Scanner;
public class matrix{
  public static void main(String[] args){ 
    double[] matrix = new double[4];

    // 行列を入力    
    Scanner scan = new Scanner(System.in);
    System.out.println("行列を入力してください");

    // double型に変換    
    for(int i = 0;i < 4;i++){
      matrix[i] = Double.parseDouble(scan.next());
    }

    // 分数部分の計算
    double under = (matrix[0] * matrix[3]) - (matrix[1] * matrix[2]);
    double frac = 1 / under;

    double[] imatrix = new double[4];

    // 逆行列の計算
    imatrix[0] = frac * matrix[3];
    imatrix[1] = frac * matrix[1] * -1;
    imatrix[2] = frac * matrix[2] * -1;
    imatrix[3] = frac * matrix[0];

    //入力された行列を出力
    System.out.println("\n入力された行列は\n" + matrix[0] + "\t" + matrix[1] + "\n" + matrix[2] + "\t" + matrix[3]);

    // 逆行列を出力
    // 逆行列が存在する
    if(under != 0){
      System.out.println("\n逆行列は\n" + imatrix[0] + "\t" + imatrix[1] + "\n" + imatrix[2] + "\t" + imatrix[3]);    
    }

    // 逆行列が存在しない
    else{
      System.out.println("\n逆行列は存在しません");
    }
  }
}
