public class Circle extends Figure{
  static final double PI = 3.141592;
  private double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  public void calcArea(){
    area = PI * radius * radius;
  }
}
