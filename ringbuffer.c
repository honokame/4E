#include<stdio.h>
#include<stdlib.h>

#define MAX 6

int Buffer[6];
int head = 0,tail = 0,count = 0;

int enqueue(int data){
  if((head == ((tail + 1) % MAX)) || count == MAX){
    //printf("enqueue NG\n");
    return 0;
  }
  else{
    Buffer[tail] = data;
    tail = (tail + 1) % MAX;
    count++;
    return 1;
  }
}
int dequeue(){
  int send;
  if(head == tail || count == 0){
    return 0;
  }
  else{
    send = Buffer[head];
    head = head + 1 % MAX;
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

    case 'p': // 表示
      cache = head;
      for(int i = 0;i < 5;i++){
        head = Buffer[head];
        printf("%d",Buffer[head]);
        
        }
      //}
      head = cache;
      printf("\n");
      break;

    case 'q': // 終了
      return 0;

    default: // 例外入力
      printf("i数字(数字を挿入),d(削除),p(出力),q(終了)を入力してください");
      break;
  }
  }
  return 0;
}
