import tg.*;
public class T63{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame(600,300);
    HTurtle[][] tm = new HTurtle[5][]; // 配列の配列を生成
    
    // 前半部分のカメを生成して出現
    for(int i = 0;i < 3;i++){
      tm[i] = new HTurtle[i + 1];
      for(int j = 0;j < tm[i].length;j++){
        tm[i][j] = new HTurtle(j * 50 + 50,i * 50 + 50,0);
        f.add(tm[i][j]);
      }
    }

    // 後半部分のカメを生成して出現
    for(int i = 3;i < 5;i++){
      tm[i] = new HTurtle[5 - i];
      for(int j = 0;j < tm[i].length;j++){
        tm[i][j] = new HTurtle(j * 50 + 50,i * 50 + 50,0);
        f.add(tm[i][j]);
      }
    }

    // 前半部分のカメ　描画
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < tm[i].length;j++){
        tm[i][j].polygon(i + 3,10);
      } 
    }

    // 後半部分のカメ　描画　　　
    for(int i = 3;i < 5;i++){
      for(int j = 0;j < tm[i].length;j++){
        tm[i][j].polygon(7 - i,10);
      }
    }
  }
}
