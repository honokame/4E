import java.io.*;
class ExThrows01{
  public static void main(String[] args){
    ExThrows01 ET01 = new ExThrows01();
    ET01.methodA();
  }

  void methodA(){

    // 正常時実行
    try{
      methodB();
    }
    catch(FileNotFoundException e){
      System.out.println(e.getMessage());
    }

    // 最後に実行
    finally{
      System.out.println("MeThodA was finished");
    }
  }

  void methodB() throws FileNotFoundException{ // エラーが発生するとcatchにとぶ
    FileReader exFile = new FileReader("test.txt");
  }
}
