public class Circle extends Figure{
  staticfinal double PI = 3.141592;
  private double radius;
  public double area = 0.0;
  public Circle(double radius){
    this.radius = radius;
  }
  public void calcArea(){
    area = PI * radius * radius;
  }
}
