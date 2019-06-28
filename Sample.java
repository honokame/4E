public class Sample{
  private static String staticField; // クラス変数
  private String instanceField; // インスタンス変数

  public Sample(){
    staticField = "static";
    instanceField = "instance";
  }
  
  // staticFieldを返す
  public static String getStaticMethod(){ // クラス関数
    return staticField;
  }
  
  // instanceFieldを返す
  public String getInstanceMethod(){
    return instanceField;
  }
}
