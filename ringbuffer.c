#include<stdio.h>
#include<stdlib.h>

#define bool int
#define true 1
#define false !true
#define MAX 5

int Buffer[MAX];
int head = 0,tail = 0,count = 0;

bool Empty(void){
  return count == 0;
}

bool Full(void){
  return count == MAX;
}

bool enqueue(int data){
  /*if(head == ((tail + 1) % MAX) || count == MAX){
    //printf("enqueue NG\n");
    return 0;
  }*/
  if(Full()){
    return false;
  }
  else{
    Buffer[tail] = data;
    tail++;
    //tail = (tail + 1) % MAX;
    count++;
    return true;
  }
}
int dequeue(void){
  int send;
  /*if(head == tail || count == 0){
    return 0;
  }*/
  if(Empty()){
    return -1;
  }
  else{
    send = Buffer[head];
    head++;
    //head = head + 1 % MAX;
    count--;
    return send;
  }
}

// メイン関数
int main(void){
  char input[20],command;
  int no,x,cache = 0;
  while(1){
  fgets(input,10,stdin); // 入力読み取り
  sscanf(input,"%c%d",&command,&no); // 文字と数字に変換

  switch(command){
    case 'i': // 挿入
      //enqueue(no);
      printf("%d\n",enqueue(no));
      break;

    case 'd': // 削除
      //dequeue();
      printf("%d\n",dequeue());
      break;

    /*case 'p': // 表示
      cache = head;
      for(int i = 0;i < 5;i++){
        //head = Buffer[head];
        printf("%d",dequeue());
        
        }
      //}
      head = cache;
      printf("\n");
      break;
*/
    case 'q': // 終了
      return 0;

    default: // 例外入力
      printf("i数字(数字を挿入),d(削除),p(出力),q(終了)を入力してください\n");
      break;
  }
  }
  return 0;
}
