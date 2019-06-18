import tg.*;
public class P62 {
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame(600,300);
    HTurtle[] hm = new HTurtle[10]; 
    for(int i = 0 ; i < 10; i++){
      hm[i] = new HTurtle(i * 50 + 25,150,0); 
      f.add(hm[i]);
    }
    for(int i = 0; i < 10; i++){
      hm[i].polygon(i+3, 10);
      hm[i] に代入されている HTurtle へのメソッド呼び出し
    }
  }
}
