import tg.*;
public class star{
  public static void main(String[] args){
    int n = 9;
    int k = 2;
    int size = 100;
    TurtleFrame f = new TurtleFrame();  
    Turtle m = new Turtle();
    f.add(m);
    
    for(int i = 0;i < n;i++){
      m.fd(size); 
      m.rt(k * 360.0 / n);
    }
  }
}

