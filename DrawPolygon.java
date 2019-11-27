import tg.*;
import java.util.*;
import java.util.Random.*;
import java.lang.Math.*;
import javafx.scene.paint.*;

public class DrawPolygon extends Turtle implements Drawable2{
  public void draw(int x,int y,int radius,int n,int color){
    double a = 2 * radius * Math.sin(Math.PI / n); 

    switch(color){
      case 0:
        setColor(Color.RED);    
        break;
      case 1:
        setColor(Color.BLUE);
        break;
      case 2:
        setColor(Color.YELLOW);
        break;
    }

    up();
    moveTo(x,y);
    fd(radius);
    down();
    lt((360.0 / n) + ((90.0 * (n - 2)) / n));
    for(int i = 0;i < n;i++){
      fd(a);
      lt(360.0 / n);
    }
    calcArea(radius,n,x,y);
  }

  public void calcArea(int radius,int n,int x,int y){
    double s = (n * radius * radius * Math.sin((2 * Math.PI) / n)) / 2;
    display(s,radius,x,y);
  }

  public void display(double s,int radius,int x,int y){
    System.out.printf("面積：%f,半径：%d,中心座標：(%d,%d)\n",s,radius,x,y);
  }

  public static void main(String[] args){
    int x,y,n,radius,color;
    TurtleFrame f = new TurtleFrame();
    DrawPolygon[] kame = new DrawPolygon[20];

    for(int i = 0; i < 20;i++){ 
      kame[i] = new DrawPolygon();
      f.add(kame[i]);
      Random rand = new Random();
      x = rand.nextInt(401);
      y = rand.nextInt(401);
      n = rand.nextInt(8) + 3;
      radius = rand.nextInt(100) + 1;
      color = rand.nextInt(3);
      kame[i].draw(x,y,radius,n,color);
    }
  }
}
