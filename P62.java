import tg.*;
public class P62{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame(600,300); // 600,300のTurtleFrameを作成（f）
    HTurtle[] hm = new HTurtle[10]; // HTurtle配列のオブジェクトを生成(hm)
    
    // hmを10匹作成し50間隔で出現させる
    for(int i = 0;i < 10;i++){
      hm[i] = new HTurtle(i * 50 + 25,150,0); 
      f.add(hm[i]);
    }
    
    // それぞれのhmに長さ10のi+3角形を描かせる
    for(int i = 0;i < 10;i++){
      hm[i].polygon(i+3,10);
    }
  }
}
