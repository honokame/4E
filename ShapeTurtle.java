import tg.*;
public class ShapeTurtle extends Turtle {
  public static void main(String[] args) {
    ShapeTurtle m = new ShapeTurtle();
    TurtleFrame f = new TurtleFrame();
    f.add(m);
    m.drawShape(100, 90, 50, 45, Math.sqrt(2)*100, 135, 150);
  }
  
  void drawShape(double... a){
    for(int i=0;i<a.length;i++){
      if(i%2==0){fd(a[i]);}
      else{rt(a[i]);}
    }
  }
}
