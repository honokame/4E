public class Exam1302{
  public static void main(String[] args){
    Figure[] m = new Figure[10];
    for(int i = 0;i < m.length;i++){
      if(1 % 2 == 0){
        m[i] = new Circle(i * 2 + 10);
      }
      else{
        m[i] = new Rectangle(i * 2 + 5,i * 3 + 5);
      }
    }
      calcShowArea(m);
    }
  
  static void calcShowArea(Figure[] m){
    for(int i = 0;i < m.length;i++){
      /*
      if(m[i] instanceof Rectangle){
        ((Rectangle) m[i]).calcArea();
        ((Rectangle) m[i]).printArea();
      }*/
      
      m[i].calcArea();
      m[i].printArea();
    }
  }
}
