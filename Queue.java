import java.util.*;

public class Queue<T>{
  private List<T> Queue = new ArrayList<T>();
  private int QueueSize;
  private int head = 0;
  private int tail= 0;
  private int count = 0;

  // 指定なし
  public Queue(){
    this.QueueSize = 10;
  }

  // サイズ指定あり
  public Queue(int size){
    this.QueueSize = size + 1;
  }

  private boolean Full(){
    return this.head == ((this.tail + 1) % this.QueueSize) || this.count == this.QueueSize;
  }

  private boolean Empty(){
    return this.head == this.tail || this.count == 0;
  }

  // enqueue enqueueできたか返す
  public boolean enqueue(T data){
    if(Full()){
      return false;
    }
    else{
      this.tail++;
      this.Queue.add(data);
      this.tail = this.tail % this.QueueSize;
      this.count++;
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
      send = this.Queue.get(this.head);
      this.head = this.head + 1 % this.QueueSize;
      this.count--;
      return send;
    }
  }

  public static void main(String args[]){
    Queue<String> testQueue = new Queue<String>(2);
    System.out.println(testQueue.enqueue("erumo"));
    System.out.println(testQueue.enqueue("kuso"));
    System.out.println(testQueue.enqueue("mikan"));
    System.out.println(testQueue.dequeue());
    System.out.println(testQueue.enqueue("ringo"));
    System.out.println(testQueue.dequeue());
    System.out.println(testQueue.dequeue());
    System.out.println(testQueue.dequeue());
    System.out.println(testQueue.enqueue("ringo"));
  }
}
