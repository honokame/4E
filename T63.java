import tg.*;
public class T63{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame(600,300);
    HTurtle[][] tm = new HTurtle[5][]; // 配列の配列を生成
    // i行目の配列の大きさを定義する
    for(int i = 0;i < 3;i++){
    tm[i] = new HTurtle[i + 1];
    /*tm[1] = new HTurtle[2];
    tm[2] = new HTurtle[3];
    tm[3] = new HTurtle[2];
    tm[4] = new HTurtle[1];*/
    

    // それぞれのカメを定義する
    //for(int i = 0;i < tm.length;i++){
      for(int j = 0;j < tm[i].length;j++){
        tm[i][j] = new HTurtle(j * 50 + 50,i * 50 + 50,0);
        f.add(tm[i][j]);
      }
      /*
        tm[i][2] = new HTurtle(j * 50 + 50,i * 50 + 50,0); 
        f.add(tm[i][2]);
        tm[i][3] = new HTurtle(j * 50 + 50,i * 50 + 50,0); 
        f.add(tm[i][3]);
        tm[i][2] = new HTurtle(j * 50 + 50,i * 50 + 50,0); 
        f.add(tm[i][2]);
        tm[i][1] = new HTurtle(j * 50 + 50,i * 50 + 50,0);
        f.add(tm[i][1]);
      }*/
    }
      
      // 一匹ずつ描く
      for(int i = 0;i < 3;i++){
      for(int j = 0;j < tm[i].length;j++){
      tm[i][j].polygon(i + 3,10);
      }
      }
    }
  }
