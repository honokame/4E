public class ExSample{
  public static void main(String[] args){ 
    Sample sp = new Sample(); 
    System.out.println(Sample.getStaticMethod()); // staticFieldを出力
    System.out.println(sp.getInstanceMethod()); // instanceFieldを出力
  }
}
