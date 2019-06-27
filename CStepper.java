import tg.*;
public class CStepper extends Turtle{
  private int n;
  private double size;
  private int j = 0;
  
  // 一辺がsizeのn角形を作成
  public CStepper(int n,double size){ // コンストラクタ（クラス名のメソッド）
    this.n = n; 
    this.size = size; 
  }

  // 一辺がsizeのn角形を(x,y,angle)に作成 
  public CStepper(int n,double size,double x,double y,double angle){ // コンストラクタ（クラス名のメソッド）
    super(x,y,angle); // Turtleのコンストラクタ呼び出し
    this.n = n;
    this.size = size;
  }

  public void step(){

    // 描き終えているか
    if(j >= n){
      return; 
    }

    // 一回分描く
    fd(size);
    rt(360.0/n);
    j++;
  }
}
