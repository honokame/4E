import tg.*;
public class Graph extends Turtle{
  private int j = 0; // 非公開インスタンス変数jの宣言
  public void drawlines(int n,int[] x,int[] y){
    
    // n個のデータを描き終えたか
    if(j == n){
      return; // n個のデータを描き終えてたら終了
    }

    // 続行
    
    // 配列データを描画する 
    for(j = 0;j < n;j++){ // x,yの配列を要素数ごとに格納する
      moveTo(x[j],y[j]); // (x[j],y[j])まで移動する
    }
    // 1つの配列データの描画が完了
  }
}
