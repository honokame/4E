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
    if(this.head == (this.tail + 1) % this.QueueSize){
      return true;
    }
    else{
      return false;
    }
  }

  private boolean Empty(){
    if(this.head == this.tail){
      return true;
    }
    else{
      return false;
    }
  }
  
  // enqueue enqueueできたか返す
  public boolean enqueue(T data){
    if(Full()){
      return false;
    }
    else{
      this.Queue.add(data);
      this.tail++;
      return true;
  }
  }
  
  // dequeue 
  public T dequeue(){
    T send;
    if(Empty()){
      return null;
    }
    else{
      this.head++;
      send = this.Queue.get(this.head);
      this.Queue.add(null);
      return send;
    }
  }

  public static void main(String args[]){
    Queue<String> testQueue = new Queue<String>(2);
  }
}
