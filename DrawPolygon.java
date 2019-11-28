import tg.*;
import java.util.*;
import java.util.Random.*;
import java.lang.Math.*;
import javafx.scene.paint.*;

public class DrawPolygon extends Turtle implements Drawable2{
  // 任意の多角形を描画
  public void draw(int x,int y,int radius,int polygon,int color){
    double side= 2 * radius * Math.sin(Math.PI / polygon); // １辺の長さ
    
    // カメの色決定
    switch(color){
      case 0:
        setColor(Color.RED);    
        break;
      case 1:
        setColor(Color.BLUE);
        break;
      case 2:
        setColor(Color.YELLOW);
        break;
    }
    // 中心座標まで移動後、半径分も移動
    // 表示されない
    up();
    moveTo(x,y);
    fd(radius);

    // 描画
    // １回目だけ回る角度が異なる
    down();
    lt((360.0 / polygon) + ((90.0 * (polygon - 2)) / polygon));
    for(int i = 0;i < polygon;i++){
      fd(side);
      lt(360.0 / polygon);
    }
    calcArea(x,y,radius,polygon);
  }

  // 多角形の面積を計算
  public void calcArea(int x,int y,int radius,int polygon){
    double area = (polygon * Math.pow(radius,2) * Math.sin((2 * Math.PI) / polygon)) / 2;
    display(x,y,radius,area);
  }
  
  // 表示
  public void display(int x,int y,int radius,double area){
    System.out.printf("area = %f,radius = %d,Point = (%d,%d)\n",area,radius,x,y);
  }

  public static void main(String[] args){
    int x,y,polygon,radius,color;
    TurtleFrame frame = new TurtleFrame();
    DrawPolygon[] turtle = new DrawPolygon[20];

    for(int i = 0; i < 20;i++){ 
      turtle[i] = new DrawPolygon();
      frame.add(turtle[i]);
      
      // 乱数生成
      Random rand = new Random();
      x = rand.nextInt(401);
      y = rand.nextInt(401);
      polygon = rand.nextInt(8) + 3;
      radius = rand.nextInt(100) + 1;
      color = rand.nextInt(3);
      turtle[i].draw(x,y,radius,polygon,color);
    }
  }
}
