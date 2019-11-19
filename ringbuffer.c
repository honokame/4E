#include<stdio.h>
#include<stdlib.h>

#define bool int
#define true 1
#define false !true
#define MAX 5

int Buffer[1000];
int head = 0,tail = 0,count = 0;

bool Empty(void){
  return count == 0;
}

bool Full(void){
  return count == MAX;
}

bool enqueue(int data){
  if(Full()){
    return false;
  }
  else{
    Buffer[tail] = data;
    tail++;
    count++;
    return true;
  }
}
int dequeue(void){
  int send;
  if(Empty()){
    return -1;
  }
  else{
    send = Buffer[head];
    head++;
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
        printf("%d\n",enqueue(no));
        break;

      case 'd': // 削除
        printf("%d\n",dequeue());
        break;

      case 'p': // 表示
        for(int i = 0;i < count;i++){
          printf("%d",Buffer[head + cache]);
          cache++;
        }
        cache = 0;
        printf("\n");
        break;

      case 'q': // 終了
        return 0;

      default: // 例外入力
        printf("i数字(数字を挿入),d(削除),p(出力),q(終了)を入力してください\n");
        break;
    }
  }
  return 0;
}
