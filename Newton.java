import static java.lang.Math.*;
public class Newton{ 
  public static void main(String[] args){ 
   double[] x = {0.2};
   int i = 0;

    for(i = 0;i < 1000;i++){
      x[i + 1] = x[i] - (0.5 - x[i] + (0.2 * sin(x[i]))/-1 + (0.2 * cos(x[i])));
      if(0.5 - x[i + 1] + (0.2 * sin(x[i + 1])) == 0){
        System.out.println("x = "+x[i + 1]);
      }
    }
    // return i;
  }        
}
