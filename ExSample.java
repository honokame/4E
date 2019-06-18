public class ExSample{
  public static void main(String[] args){
    Sample sp = new Sample();
    System.out.println(Sample.getStaticMethod());
    System.out.println(sp.getInstanceMethod());
  }
}
