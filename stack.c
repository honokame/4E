#include<stdio.h>
#include<stdlib.h>

// stackの構造体
typedef struct stack1{
  int data;
  struct stack1 *next;
} stack;

// グローバル変数
int x;

// メモリを確保　先頭アドレスを返す
stack *memory(void){
  return ((stack *) malloc(sizeof(stack)));
} 

// push 先頭ポインタを返す
stack *push(int x,stack *top){
  stack *p;
  p = memory();
  p->data = x;
  p->next = top;
  return p;
}

// pop 先頭ポインタを返す
stack *pop(stack *top){
  
  // アンダーフロー
  if(top == NULL){
    printf("pop NG\n");
  }
  else{
    x = top->data;
    top = top->next;
  }
  return top;
}

// メイン関数
int main(void){
  stack *top = NULL;
  char input[20],command;
  int no;

  printf("i 数字(数字を挿入),d(削除),m 数字(数字分削除),p(出力),q(終了)を入力してください。\n");
　
  // stackの無限ループ
  while(1){
    fgets(input,10,stdin); // 入力読み取り
    sscanf(input,"%c %d",&command,&no); // 文字と数字に変換

    switch(command){
      case 'i': // 挿入
        top = push(no,top);
        break;
      
      case 'd': // 削除
        top = pop(top);
        break;
      
      case 'm': // 複数削除
        for(int i = 0;i < no;i++){
          top = pop(top);
        }
        break;
      
      case 'p': // 表示
        while(top != NULL){
          top = pop(top);
          printf("%d ",x);
        }
        printf("\n");
        break;
      
      case 'q': // 終了
        return 0;
    }
  }
  return 0;
}
