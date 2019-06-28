public class ExInner{
  private String exInnerStr = "ExInnerのインスタンス変数"; // exInnerStrの初期値を代入
  
  private class InInner{ // 内部クラスInInner
    private String inInnerStr = "InInnerのインスタンス変数"; // inInnerStrの初期値を代入
    
    // exInnerStr、inInnerstrを出力
    public void inInnerMethod(){ // 内部クラスInInnerのメソッド
      System.out.println(exInnerStr);
      System.out.println(inInnerStr);
    }
  } // 内部クラス終了 
 
  public void exInnerMethod(){ // ExInnerのメソッド
    InInner inInner = new InInner(); // inInnerStrに代入
    inInner.inInnerMethod(); // exInnerStr、inInnerstrを出力
  }
}
