public class MyTurtle extends HTurtle{ /** n 軒の家を大きさ s で w の間隔で描く。*/
  public void houses(int n, double s, double w){
    for(int i = 0; i < n; i++){
      house(s);
      rt(90); up(); fd(w+s); down(); lt(90);
    }
  }
  /** n 角形の周りにm 角形を1辺の長さ s で描く。
   * */ public void houses(int n, double s, double w){
     for(int i = 0; i < n; i++){
       house(s);
       rt(90); up(); fd(w+s); down(); lt(90);
     }
   }
   /** n 角形の周りにm 角形を1辺の長さ s で描く。*/
   public void pPolygon(int n, int m, double s){
     for(int j = 0; j < n; j++){
       polygon(m, s);
       fd(s);
       lt(360/n);
     }
   }
   /** (x, y) を左下の座標にし，1辺の長さ s で家の絵を描く。*/ 
   public void house(double s, double x, double y){
     up(); moveTo(x, y, 0); down();
     house(s);
   }
   /** (x, y) を左下の座標にし， n 軒の家を大きさ s で w の間隔
    * で描く。*/ 
   public void houses(int n, double s, double w, double x,
       double y){
     up(); moveTo(x, y, 0); down();
     houses(n, s, w);
   }
}

