import tg.*;
import java.util.*;
import java.util.Random;
import java.lang.Math;

public class DrawPolygon extends Turtle implements Drawable2{
  public void draw(int x,int y,int radius,int n,int color){
    double a = 2 * radius * Math.sin(Math.PI / n); 
    up();
    moveTo(x,y);
    fd(radius);
    down();
    lt((360.0 / n) + ((90.0 * (n - 2)) / n));
    for(int i = 0;i < n;i++){
      fd(a);
      lt(360.0 / n);
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
      kame.draw(x,y,radius,n,color);
    }
  }
}




