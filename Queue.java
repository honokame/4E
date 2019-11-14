import java.util.*;

public class Queue<T>{
  private List<T> Queue = new ArrayList<T>();
  private int QueueSize;
  private int head;
  private int tail;


  // 指定なし
  public Queue(){
    this.QueueSize = 10;
    this.head = 0;
    this.tail = 0;
  }

  // サイズ指定あり
  public Queue(int size){
    this.QueueSize = size;
    this.head = 0;
    this.tail = 0;
  }

  private boolean Full(){
  }

  private boolean Empty(){
  }
  // enqueue enqueueできたか返す
  public boolean enqueue(T data){

  }

  // dequeue 
  public T dequeue(){
  }

  public static void main(String args[]){
    Queue<String> testQueue = new Queue<String>(2);
  }
}
