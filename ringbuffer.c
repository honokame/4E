#include<stdio.h>
#include<stdlib.h>

#define MAX 6

int Buffer[6];
int head = 0,tail = 0,count = 0;

void enqueue(int data){
  if(head == ((tail + 1) % MAX)) || count == MAX{
    printf("enqueue NG\n");
  }
  else{
    Buffer[tail] = data;
    tail = (tail + 1) % MAX;
    count++;
  }
void dequeue(){
  int send;
  if(head == tail || count == 0){
    return NULL;
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
  int no;

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
      break;

    case 'q': // 終了
      return 0;

    default: // 例外入力
      printf("i数字(数字を挿入),d(削除),p(出力),q(終了)を入力してください");
      break;
  }
  return 0;
}
