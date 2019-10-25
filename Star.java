import tg.*;
public class Star{
  public static void Starwrite(Turtle m){
    int i,n = 5,k = 3;
    double d = 80,a = 360 / n;
    for(i = 0;i < n;i++){
      m.lt(a * k);
      m.fd(d);
    }
  }
  
  public static void Starwrite(int n,int k,Turtle m){
    int i;
    double d = 80,a = 360 / n;
    for(i = 0;i < n;i++){
      m.lt(a * k);
      m.fd(d);
      Shapewrite(m);
    }
  }
  
  public static void Shapewrite(Turtle m){
    int i;
    double d = 20,a = 360 / 6;
    for(i = 0;i < 6;i++){
      m.fd(d);
      m.lt(a);
    }
  }
  
  public static void main(String[] args){
    int n = 5,k = 3;
    if(args.length==2){
      n = Integer.parseInt(args[0]);
      k = Integer.parseInt(args[1]);
    }
    TurtleFrame f = new TurtleFrame();
    Turtle m = new Turtle();
    f.add(m);
    if(args.length==2){
      Starwrite(n,k,m);
    }
    else{
      Starwrite(m);
    }
  }
}
