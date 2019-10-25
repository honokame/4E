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

  // push
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

  // pop を返す
  public T pop(){
    T send; // StackPointerの記憶用

    // アンダーフロー pop NG
    if(Empty()){
      return null;
    }

    // pop OK
    else{
      send = this.stack.get(this.StackPointer-1); // stackのトップを取得
      this.stack.remove(this.StackPointer-1); // stackのトップの要素を削除
      this.StackPointer--; // StackPointerを1減らす
      return send; // stackのトップを返す
    }
  }

  public static void main(String args[]){
    Stack<String> testStack = new Stack<String>();
    testStack.push("erumo");
    testStack.push("kuso");
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
  }
}



