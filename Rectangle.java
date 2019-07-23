public class Rectangle extends Figure{
  double base,height;
  staticfinal double PI = 3.141592;
  public Rectangle(double base,double height){
    this.base = base;
    this.height = height;
  }
  public void calcArea(){
    area = base * height;
  }
}
