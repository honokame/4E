import tg.*;
public class T62{
  public static void main(String[] args){
    TurtleFrame f = new TurtleFrame(600,300);
    HTurtle[][] tm = new HTurtle[3][4];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 4;j++){
        tm[i][j] = new HTurtle(j * 50 + 50,i * 50+ 50,0);
        f.add(tm[i][j]);
      }
    }
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 4;j++){
        tm[i][j].polygon(i + 3,(j + 1) * 10);
      }
    }
  }
}
