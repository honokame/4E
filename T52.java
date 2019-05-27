import tg.*;
public class T52{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    Stepper m1 = new Stepper();
    f.add(m1);
    Stepper m2 = new Stepper();
    f.add(m2);
    m1.n = 3; m1.size = 100;
    m2.n = 4; m2.size = 100;
    m1.up(); m1.moveTo(100,200,0);
    m1.down();
    for(int i = 0; i < 4; i++){
      m1.step();
      m2.step();
    }
  }
}

