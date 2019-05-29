import tg.*;
public class T51 {
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    HTurtle m = new HTurtle(); // 拡張したHTurtle
    double size = 50;
    f.add(m);
    m.house(size); // 辺の長さが50の家を描く
    m.up(); // ペンを上げる、かめは消えない
    m.lt(90); 
    m.fd(50); 
    m.rt(72); 
    m.down(); // ペンをおろす
    m.polygon(5,size / 2); // 辺の長さが25の五角形を描く
    m.up(); 
    m.moveTo(100,100,0); // かめを(100,100)まで移動させ0度に向かせる
    m.down();
    m.polygon(10,size / 5); // 辺の長さが20の十角形を描く
  }
}
