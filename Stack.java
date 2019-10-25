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
  public boolean push(T data){
    if(Full()){
      return false;
    }
    else{
      this.stack.add(data);
      this.StackPointer++;
      return true;
    }
  }

  // pop
  public T pop(){
    T send;
    if(Empty()){
      return null;
    }
    else{
      send = this.stack.get(this.StackPointer-1);
      this.stack.remove(this.StackPointer-1);
      this.StackPointer--;
      return send;
    }
  }
}

      


