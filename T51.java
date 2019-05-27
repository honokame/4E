import tg.*;
public class T51 {
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    HTurtle m = new HTurtle();
    double size = 50;
    f.add(m);
    m.house(size); //(1)
    m.up(); m.lt(90); m.fd(50); m.rt(72); m.down();
    m.polygon(5, size / 2); //(2)
    m.up(); m.moveTo(100,100,0); m.down();
    m.polygon(10, size / 5); //(3)
  }
}
