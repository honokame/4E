import tg.*;
public class CStepper extends Turtle{
  private int n;
  private double size;
  private int j = 0;
  public CStepper(int n, double size) {
    this.n = n; 
    this.size = size; 
  }
  
  public CStepper(int n, double size, double x,double y, double angle) {
    super(x, y, angle);
    this.n = n;
    this.size = size;
  }
  
  public void step() {
    if(j >= n){
      return; fd(size);
    }
    rt(360.0/n);
    j++;
  }
}
