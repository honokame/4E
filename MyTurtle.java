public class MyTurtle extends HTurtle{ 
  
  // 辺の長さがsの家をwの間隔でn軒描く
  public void houses(int n,double s,double w){
    for(int i = 0;i < n;i++){
      house(s);
      rt(90); 
      up(); 
      fd(w + s); 
      down(); 
      lt(90);
    }
  }
   
  // n角形の周りに辺の長さがsのm角形を描く
  public void pPolygon(int n,int m,double s){
    for(int j = 0;j < n;j++){
      polygon(m,s);
      fd(s);
      lt(360/n);
    }
  }

  // (x,y)を左下の座標にし、辺の長さがsの家を描く 
  public void house(double s,double x,double y){
    up(); 
    moveTo(x,y,0); 
    down();
    house(s);
  }

  // (x,y)を左下の座標にし、辺の長さがsの家をwの間隔でn軒描く 
  public void houses(int n,double s,double w,double x,double y){
    up(); 
    moveTo(x,y,0); 
    down();
    houses(n,s,w);
  }
}
