import tg.*;
public class Stepper extends Turtle{
  public int n; //公開されたインスタンス変数 n の宣言
  public double size; //公開されたインスタンス変数 size の宣言
  private int j = 0; //（非公開）インスタンス変数 j の宣言
  public void step() {
    if(j >= n)
      return; //描き終えていたならすぐ終了
    fd(size);
    rt(360/n);
    j++; //j の値を 1 増やす
  }
}

