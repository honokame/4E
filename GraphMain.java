import tg.*;
import javafx.scene.paint.*;

public class GraphMain{
  public static void main(String[] args){
    int x0 = 20,y0 = 200,xmin = 0,xmax = 360,ymin = -180,ymax = 180;
    TurtleFrame f = new TurtleFrame();
    Graph m = new Graph(); 
    f.add(m);

    m.setColor(Color.RED);
    m.up(); 
    m.moveTo(xmin + x0,y0,0);
    m.down(); 
    m.moveTo(xmax + x0,y0,180);
    m.up(); 
    m.moveTo(x0,ymin + y0,90);
    m.down(); 
    m.moveTo(x0,ymax + y0,90);
    m.up(); 
    m.moveTo(x0,y0,90); 
    m.down();
    m.setColor(Color.BLACK);

    int n =  51;
    int[] x = new int[n], y = new int[n];
    
    for(int i = 0;i < n;i++){
      x[i] = 7 * i + x0;
      y[i] = -(int)(100 * Math.sin(2 * Math.PI * i / (n-1))) + y0;
    }
    m.drawlines(n,x,y);
  }
}
