import tg.*;
public class T521{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame();
    Stepper1 m1 = new Stepper1();
    f.add(m1);
    
    Stepper1 m2 = new Stepper1();
    f.add(m2);
    
    m1.setN(-3); // m1は三角形
    m1.setSize(100); // m1の辺の長さは100
    m2.setN(-4); // m2は四角形
    m2.setSize(-100); // m2の辺の長さは100
    m1.up(); 
    m1.moveTo(100,200,0);  
    m1.down();
    
    for(int i = 0; i < 4; i++){
      m1.step(); // m1が描く、描き終わっているか確認    
      m2.step(); // m2が描く、描き終わっているか確認 
    }
  }
}
