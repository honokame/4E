import tg.*;
import javafx.scene.paint.*;
public class T411 {
  public static void main(String[] args){
    double d = 100,x,y,a,newscale;
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle(200,300,0);
    f.add(m);
    m.fd(d);
    
    // クラス変数
    Turtle.withTurtleAll = false; //かめを表示させない 
    // クラスメソッド
    Turtle.speedAll(4); // かめ全体の速さを4に変更
    
    x = m.getX(); 
    y = m.getY(); 
    a = m.getAngle() - 45;

    Turtle m1 = new Turtle(x,y,a); 
    f.add(m1);
    m1.fd(d);
    
    Turtle m2 = m.clone(); 
    f.add(m2);
    m.rt(45);
    m.fd(d);
    
    newscale = m2.tScale * 4;
    m2.tScale = newscale; 
    m2.tColor = new Color(0.0,1.0,1.0,1.0);
    
    m2.fd(d);
    Point p = f.getMousePosition();
    m2.moveTo(p.x,p.y);
    
    System.out.println(m1.getX()+","+m1.getY()); // m1の座標を出力 
    System.out.println(m.getX()+","+m.getY()); // mの座標を出力
    System.out.println(m2.getX()+","+m2.getY()); // m2の座標を出力 
  }
}

