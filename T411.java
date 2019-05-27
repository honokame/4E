import tg.*;
import javafx.scene.paint.*;
public class T411 {
  public static void main(String[] args){
    double d = 100, x, y, a;
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle(200, 300, 0);
    f.add(m);
    m.fd(d);
    Turtle.withTurtleAll = false;
    Turtle.speedAll(4); 
    x = m.getX(); // mのX座標のとり出し
    y = m.getY(); // mのY座標のとり出し
    a = m.getAngle() - 45; // mの角度のとり出し
    Turtle m1 = new Turtle(x, y, a); // m1の作成
    f.add(m1);
    m1.fd(d);
    Turtle m2 = m.clone(); //m2の作成
    f.add(m2);
    m.rt(45);
    m.fd(d);
    double newscale = m2.tScale * 4;// m2のtScaleの4倍の数
    m2.tScale = newscale; // m2のtScaleに代入
    m2.tColor = new Color(0.0, 1.0, 1.0, 1.0); // m2の亀の色を水色に変える
    m2.fd(d);
    Point p = f.getMousePosition();
    m2.moveTo(p.x, p.y);
    System.out.println(m1.getX()+","+m1.getY()); 
    System.out.println(m.getX()+","+m.getY());
    System.out.println(m2.getX()+","+m2.getY()); 
  }
}

