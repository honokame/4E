#include<stdio.h>
#include<stdlib.h>

#define MAX 5

int Buffer[10000];
int head = 0,tail = 0,count = 0;

int enqueue(int data){

  // オーバーフロー
  if(count == MAX){
    printf("enqueue NG\n");
  }
  else{
    Buffer[tail] = data;
    tail++;
    count++;
    return 0;
  }
}

int dequeue(void){
  int send;
  
  // アンダーフロー
  if(count == 0){
    printf("dequeue NG\n");
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
  int no,cache = 0;
  
  while(1){
    fgets(input,10,stdin); // 入力読み取り
    sscanf(input,"%c%d",&command,&no); // 文字と数字に変換

    switch(command){
      case 'i': // 挿入
        enqueue(no);
        break;

      case 'd': // 削除
        dequeue();
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
