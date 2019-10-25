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
  public Stack(int StackSize){
    this.StackSize = Stacksize; // 指定されたサイズのstackを生成
    this.StackPointer = 0; // stackポインタの初期化
  }


  // push
  public void push(T data){
    if(StackPointer >= stack.length){
      throw new RuntimeException("stack full");
    }
    
    this.stack.add(data);
    this.StackPointer++;
  }

  // pop
  public T pop(){
    T send;

    if(StackPointer <= 0){
      throw new RuntimeException("stack empty");
    }
    else{
    this.StackPointer--;
    
    return this.stack()

      


