import java.util.*;

public class Stack<T>{
  private List<T> stack = new ArrayList<T>(); // 可変配列
  private int StackSize; // stackのサイズ
  private int StackPointer; // stackのポインタ

  // 指定なし
  public Stack(){
    this.StackSize = 10; // 指定なしの時はサイズ10のstackを生成
    this.StackPointer = 0; // stackポインタの初期化
  }

  // サイズ指定あり
  public Stack(int size){
    this.StackSize = size; // 指定されたサイズのstackを生成
    this.StackPointer = 0; // stackポインタの初期化
  }

  // オーバーフロー
  private boolean Full(){
    if(this.StackSize == this.StackPointer){
      return true;
    }
    else{
      return false;
    }
  }

  // アンダーフロー
  private boolean Empty(){
    if(this.StackPointer == 0){
      return true;
    }
    else{
      return false;
    }
  }

  // push pushできたかを返す
  public boolean push(T data){ // 可変データをpush
    
    // オーバーフロー push NG
    if(Full()){
      return false;
    }
    
    // push OK
    else{
      this.stack.add(data); // データの追加
      this.StackPointer++; // StackPointerを1増やす
      return true;
    }
  }

  // pop stackのトップを返す
  public T pop(){
    T send; // Stackのトップを記憶

    // アンダーフロー pop NG
    if(Empty()){
      return null;
    }

    // pop OK
    else{
      this.StackPointer--; // StackPointerを1減らす
      send = this.stack.get(this.StackPointer); // stackのトップを取得
      this.stack.add(null); // stackのトップにnullを代入
      return send; // stackのトップを返す
    }
  }

  // テスト
  public static void main(String args[]){
    Stack<String> testStack = new Stack<String>(2);
    System.out.println(testStack.push("erumo"));
    System.out.println(testStack.push("kuso"));
    System.out.println(testStack.push("mikan"));
    System.out.println(testStack.pop());  
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
    }
}
