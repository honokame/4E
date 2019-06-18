public class ExInner {
  private String exInnerStr = "ExInnerのインスタンス変数";
  private class InInner { 
    private String inInnerStr = "InInnerのインスタンス変数";
    public void inInnerMethod() { 
      System.out.println(exInnerStr);
      System.out.println(inInnerStr);
    }
  }
 
  public void exInnerMethod() { 
    InInner inInner = new InInner();
    inInner.inInnerMethod();
  }
}
