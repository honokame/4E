import tg.*;
public class HTurtle extends Turtle { // Turtleを拡張し、HTurtleとする
  
  // 辺の長さがsのn角形を描く
  public double polygon(int n,double s){ // HTurtleのメソッド、poligonを定義
    double a = 360.0/n; // 曲がる角度を求めておく
    
    for(int j = 0;j < n;j++){ // n回繰り返す
      fd(s); // sだけ前に進む
      rt(a); // a度だけ曲がる
    }
    return n * s; // かめがどれだけ進んだか返す
  }
  
  // 辺の長さがsの家を描く
  public void house(double s){ // HTurtlのメソッド、houseを定義
    polygon(4,s); // polygonを利用し四角形を描く
    fd(s);
    rt(30);
    polygon(3,s); // polygonを利用し三角形を描く
    lt(30);
    bk(s); // もとの場所に戻しておく
  }
}
