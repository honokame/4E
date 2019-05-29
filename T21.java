import tg.*; 
public class T21 {   
  public static void main(String[] args){
    TurtleFrame f; // 変数fの型を宣言                 
    f =  new TurtleFrame(); // TurtleFrame(400*400)を生成し、fに代入     
    
    // 型名　変数名　 =　インスタンス生成式　　　　
    Turtle m = new Turtle(180,230,0); // (180,230,0)でTurtleを生成し、変数mの型を宣言し代入
    
    // メソッド呼び出し
    f.add(m); // mをfに追加する                       
    m.fd(70); // mを70前に進める                                     
    m.rt(51.43); // mを51,43度右に回す                 
    m.fd(70);
    m.rt(51.43);                 
    m.fd(70);
    m.rt(51.43);
    m.fd(70);                                      
    m.rt(51.43);                 
    m.fd(70);
    m.rt(51.43);
    m.fd(70);                                      
    m.rt(51.43);                 
    m.fd(70);
    m.rt(321.43);
    m.fd(70);                                      
    m.rt(51.43);                 
    m.fd(70);
    m.rt(51.43);                 
    m.fd(70);
    m.rt(51.43);
    m.fd(70);                                      
    m.rt(51.43);                 
    m.fd(70);
    m.rt(51.43);
    m.fd(70);                                      
    m.rt(51.43);                 
    m.fd(70);                                      
    m.rt(51.43);            
  }     
}        
