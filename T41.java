import static java.lang.Math.*;
public class T41{
  public static void main(String[] args){
    double x,e,i;

    //x = random();
    //e = pow((sin(x * PI / 180) + log(x)),2);
    
    for(i = 0;i < 10000;i++){
      x = random();
      e = pow((sin(x * PI / 180) + log(x)),2);
      if(i == 10000){
        System.out.println("近似値解は得られなかった");
        System.exit(0);
      }
      if(e < 0.00001){
        System.out.println(x);
        System.out.println(i);
        System.exit(0);
      }
    }
  }
}


