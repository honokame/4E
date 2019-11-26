import tg.*;
import java.util.*;
import java.util.Random;

public class DrawPolygon extends Turtle implements Drawable2{
  public void draw(int x,int y,int radius,int n,int color){
    //TurtleFrame f = new TurtleFrame();
    //f.add(hm);

  }
  
  public static void main(String[] args){
    int x,y,n,radius,color;
    TurtleFrame f = new TurtleFrame();
    DrawPolygon hm = new DrawPolygon();
    //Turtle hm = new Turtle();
    Random rand1 = new Random();
    //f.add(hm);
    /*int x = rand.nextInt(401);
    int y = rand.nextInt(401);
    int n = rand.nextInt(8) + 3;
    int radius = rand.nextInt(100) + 1;
    int color = rand.nextInt(3);
    */
    
    for(int i = 0; i < 20;i++){ 
      Random rand = new Random();
      x = rand1.nextInt(401);
      y = rand1.nextInt(401);
      n = rand1.nextInt(8) + 3;
      radius = rand1.nextInt(100) + 1;
      color = rand1.nextInt(3);
      //f.add(hm);

  //   hm.draw(x,y,radius,n,color);
    }
  }
}




