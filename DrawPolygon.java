import tg.*;
import java.util.*;
import java.util.Random;

public class DrawPolygon extends Turtle implements Drawable2{
  public void draw(int x,int y,int radius,int n,int color){
    //private int i;
    up();
    moveTo(x,y,0);
    down();
    for(int i = 0;i < n;i++){
      fd(radius);
      rt(360.0 / n);
    }
  }

  public static void main(String[] args){
    int x,y,n,radius,color;
    TurtleFrame f = new TurtleFrame();
    DrawPolygon kame = new DrawPolygon();
    Random rand1 = new Random();
    f.add(kame);

    for(int i = 0; i < 20;i++){ 
      Random rand = new Random();
      x = rand1.nextInt(401);
      y = rand1.nextInt(401);
      n = rand1.nextInt(8) + 3;
      radius = rand1.nextInt(100) + 1;
      color = rand1.nextInt(3);
      //kame[i] = new DrawPolygon();
      //f.add(kame[i]);
      kame.draw(x,y,radius,n,color);
    }
  }
}




