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

  // push
  public 

