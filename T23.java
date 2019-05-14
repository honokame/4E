import tg.*;
import javafx.scene.paint.*;
//import java.awt.Color;
public class T23 {
  public static void main(String[] args){
    double d = 100,x,y,a;
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle(200,300,0);
    f.add(m);
    m.fd(d);
    x = m.getX(); // m の X 座標のとり出し
    y = m.getY(); // m の Y 座標のとり出し
    a = m.getAngle() - 45; // m の角度のとり出し
    Turtle m1 = new Turtle(x,y,a); // m1 の作成
    f.add(m1);
    m1.fd(d);
    Turtle m2 = m.clone(); // m2 の作成
    f.add(m2);
    m.rt(45);
    m.fd(d);
    double newscale = m2.tScale * 4; // m2 の tScale の 4 倍の数
    m2.tScale = newscale;
    m2.tColor = new Color(0.0,1.0,1.0,1.0); // m2 の亀の色を水色に変える
    Color c  = new Color(0.0,0.0,0.0,0.0);
    m2.setColor(c);
    m2.fd(d);
    Point p = f.getMousePosition();
    m2.moveTo(p.x,p.y);
  }
}

