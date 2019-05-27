import tg.*;
import javafx.scene.paint.*;
public class T23 {
  public static void main(String[] args){
    double d = 50,x,y,a;
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle(200,300,0);
    f.add(m);
    m.fd(d);
    x = m.getX(); // m の X 座標のとり出し
    y = m.getY(); // m の Y 座標のとり出し
    a = m.getAngle() - 45; // m の角度のとり出し
    m.rt(a);
    m.fd(d);
    Turtle m2 = new Turtle(x,y,0);
    f.add(m2);
    double newscale = m2.tScale * 2; // m2 の tScale の 4 倍の数
    m2.tScale = newscale;
    m2.tColor = new Color(0.0,1.0,1.0,1.0); // m2 の亀の色を水色に変える
    Turtle m5 = m2.clone();
    f.add(m5);
    m2.fd(d);
    Turtle m3 = new Turtle(x + d,y - d,90); 
    f.add(m3);
    m3.fd(d);
    Turtle m4 = new Turtle(x + d,y - d,0);
    f.add(m4);
    m4.fd(d);
    Point p = f.getMousePosition();
    m5.moveTo(p.x,p.y);
  }
}

