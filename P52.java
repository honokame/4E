import tg.*;
public class P52 {
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    MyTurtle m = new MyTurtle();
    f.add(m);
    m.pPolygon(10, 3, 15);
  }
}
