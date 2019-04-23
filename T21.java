import tg.*; 
public class T21 {   
  public static void main(String[] args){
    TurtleFrame f;                  
    f =  new TurtleFrame();      
    Turtle m = new Turtle();    
    Turtle m1 = new Turtle();
    Turtle m2 = new Turtle(150,300,0);
    Turtle m3 = new Turtle(150,300,0);
    Turtle m4 = new Turtle(150,300,0);
    f.add(m);                        
    f.add(m1);
//    f.add(m3);
//    f.add(m4);
    m.fd(50);                                      
    m1.rt(90);                 
    m1.fd(50);
    f.add(m2);
    f.add(m3);
    f.add(m4);
    m3.tcolor = new java.awt.Color(0,255,255);
    m4.tcolor = new java.awt.Color(0,255,255);
    m2.fd(50);
    m3.fd(50);
    m4.fd(50);
    m2.rt(315);
    m2.fd(75);
    m3.fd(75);
    m4.rt(45);
    m4.fd(125);
  }     
}        
