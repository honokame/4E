import tg.*;
public class P91{ 
  public static void main(String[] args){ 
    TurtleFrame f = new TurtleFrame(); 
    Turtle m = new HTurtle(); // HTurtleを生成しTurtle型のmに代入 
    f.add(m);             
    m.fd(100);       
    if(m instanceof HTurtle){ 
      ((HTurtle) m).house(50); 
    } 
  } 
}
