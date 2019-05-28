import tg.*;
import javafx.scene.paint.*;
public class T23 {
  public static void main(String[] args){
    double d = 50,x,y,a;
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle(200,300,0);
    f.add(m);
    m.fd(d);
    
    // 返り値を格納する変数が必要
    x = m.getX(); // mのX座標をとり出しxに代入
    y = m.getY(); // mのY座標をとり出しyに代入
    a = m.getAngle() - 45; //mの角度をとり出し、45度引いてzに代入
    
    m.rt(a);
    m.fd(d);
    
    Turtle m2 = new Turtle(x,y,0);
    f.add(m2);
    double newscale = m2.tScale * 2; // m2のtScaleの2倍の数を変数newscaleに代入
    m2.tScale = newscale; // m2の大きさをnewscaleに変更
    m2.tColor = new Color(0.0,1.0,1.0,1.0); // m2の色を水色に変更
    
    Turtle m5 = m2.clone(); // m2と同じ状態のかめをm5に代入
    f.add(m5);
    m2.fd(d);
    
    Turtle m3 = new Turtle(x + d,y - d,90); 
    f.add(m3);
    m3.fd(d);
    
    Turtle m4 = new Turtle(x + d,y - d,0);
    f.add(m4);
    m4.fd(d);
    Point p = f.getMousePosition(); // クリックしたマウスの座標をとり出し変数pに代入
    m5.moveTo(p.x,p.y); // m5は(pのx座標,pのy座標)まで進む
  }
}

