import tg.*;
public class Stepper extends Turtle{ // Turtleを拡張しStepperを定義
  public int n; // 公開されたインスタンス変数nの宣言
  public double size; // 公開されたインスタンス変数sizeの宣言
  private int j = 0; // 非公開インスタンス変数jの宣言
  
  public void step() {
    if(j >= n){
      return; // 描き終えていたら終了
    }
    
    // もう一度、辺の長さがsizeのn角形の一辺だけを描く
    fd(size);
    rt(360 / n);
    j++; 
  }
}

