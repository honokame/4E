import tg.*;
public class Stepper1 extends Turtle{ // Turtleを拡張しStepperを定義
  private int n; // 非公開されたインスタンス変数nの宣言
  private double size; // 非公開されたインスタンス変数sizeの宣言
  private int j = 0; // 非公開インスタンス変数jの宣言
  
  public void setN(int n){
    if(n > 2){
      this.n = n;
    }
    else{
      System.out.println("値が無効です（n）");
    }
  }

  public int getN(){
   return n;
  }

  public void setSize(double size){
    if(size > 0){
      this.size = size;
    }
    else{
      System.out.println("値が無効です（size）");
    }
  }

  public double getSize(){
    return size;
  }

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

