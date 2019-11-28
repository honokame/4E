import java.util.*;

public class Stack<T>{
  private List<T> Stack = new ArrayList<T>();
  private int StackSize; 
  private int StackPointer = 0; 

  public Stack(){
    this.StackSize = 10; 
  }

  public Stack(int size){
    this.StackSize = size; 
  }

  private boolean Full(){
    return this.StackSize == this.StackPointer;
  }

  private boolean Empty(){
    return this.StackPointer == 0;
  }

  public boolean push(T data){
    if(Full()){
      return false;
    }
    else{
      this.Stack.add(data); 
      this.StackPointer++; 
      return true;
    }
  }

  public T pop(){
    T send; // Stackの先頭データ記憶用
    if(Empty()){
      return null;
    }
    else{
      this.StackPointer--;
      send = this.Stack.get(this.StackPointer);
      this.Stack.remove(this.StackPointer);
      return send; 
    }
  }

  // テスト
  public static void main(String args[]){
    Stack<String> testStack = new Stack<String>(2);
    System.out.println(testStack.push("erumo"));
    System.out.println(testStack.push("kuso"));
    System.out.println(testStack.pop());
    System.out.println(testStack.push("mikan"));
    System.out.println(testStack.pop());  
    System.out.println(testStack.pop());
    System.out.println(testStack.pop());
    System.out.println(testStack.push("ringo"));
  }
}
