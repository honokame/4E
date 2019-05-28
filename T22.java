import tg.*; // import宣言 tgパッケージを参照
import javafx.scene.paint.*; // import宣言 javafx.scene.paintパッケージを参照
public class T22 {
  public static void main(String[] args){
    double x = 300.0, y = 200.0, d = 100.0; 
    
    TurtleFrame f = new TurtleFrame(700,500); //700*500のTurtleFrameを生成し、変数fに代入
    Turtle m = new Turtle(x,y,180.0); //(x,y,180.0)のTurtleを生成し、mに代入
    Turtle m1 = new Turtle(x+d,y+d,0.0);//(x+d,y+d,180.0)のTurtleを生成し、m1に代入
    
    //javafx.scene.paint.Color c = new javafx.scene.paint.Color(1.0,0.0,0.0,1.0); //cに赤色を代入
    Color c = new Color(0.8,0.0,0.0,1.0); // 赤色を生成し、変数cに代入
    m1.setColor(c); //m1のペンの色をにcに変更 
    
    f.add(m);
    f.add(m1);
    m.fd(d);
    m1.fd(d);
    m.lt(90.0);
    m1.lt(90.0);
    d = d / 2; //dの値をd/2に変更
    m.fd(d);
    m1.fd(d);
    m1.moveTo(m); //m1はmの方向を向き、mと同じ座標まで進む
  }
}
