public class Sample{
  private static String staticField;
  private String instanceField;
  public Sample(){
    staticField = "static";
    instanceField = "instance";
  }
  
  public static String getStaticMethod(){
    return staticField;
  }
  
  public String getInstanceMethod(){
    return instanceField;
  }
}
