import tg.*;
public class ShapeTurtle extends Turtle{
  public static void main(String[] args){
    ShapeTurtle m = new ShapeTurtle(); // ShapeTurtleを生成しmに代入
    TurtleFrame f = new TurtleFrame(); // TurtleFrameを生成しfに代入
    f.add(m); // m出現
    m.drawShape(100,90,50,45,Math.sqrt(2)*100,135,150);
  }
  
  // aの引数通りに形を描く
  void drawShape(double... a){
    for(int i = 0;i < a.length;i++){
      // iが偶数→前進
      if(i % 2 == 0){
        fd(a[i]);
      }
      // iが奇数→右折
      else{
        rt(a[i]);
      }
    }
  }
}
