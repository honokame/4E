import tg.*;
public class P52 {
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    MyTurtle m = new MyTurtle();
    f.add(m);
    m.pPolygon(10,3,15); // n角形の周りに辺の長さが15の3角形を描く
  }
}
