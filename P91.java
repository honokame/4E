import tg.*;
public class P91{ 
  public static void main(String[] args){ 
    TurtleFrame f = new TurtleFrame(); 
    Turtle m = new HTurtle();    //HTurtle を生成して Turtle 型の m に代入 
    f.add(m);             
    m.fd(100);       
    if(m  instanceof HTurtle){ 
      ((HTurtle) m).house(50); 
    } 
  } 
}
