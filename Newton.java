import static java.lang.Math.*;
public class Newton{ 
  public static void main(String[] args){ 
    double[] x = new double[1000];
    int i = 0;
    x[0] = 0.2;

    for(i = 0;i < 999;i++){
      x[i + 1] = x[i] - (0.5 - x[i] + ((0.2 * sin(x[i])))/(-1 + (0.2 * cos(x[i]))));
      if(0.5 - x[i + 1] + (0.2 * sin(x[i + 1])) >= 0.00001){
        System.out.println("x = "+x[i + 1]);
        break;
      }
    }
  }
}

