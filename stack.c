#include<stdio.h>
#include<stdlib.h>

typedef struct stack1{
  int data;
  struct stack1 *next;
} stack;

stack *memory(void){
  return ((stack *) malloc(sizeof(stack)));
} 

stack *push(int x,stack *top){
  stack *p;
  p = memory();
  p->data = x;
  p->next = top;
  return p;
}

stack *pop(stack *top){
  int x;

  if(top == NULL){
    printf("pop NG\n");
  }
  else{
    x = top->data;
    top = top->next;
  }
  return top;
}

int main(void){
  stack *top = NULL;
  char input[20],command;
  int no;

  printf("i 数字(数字を挿入),d(削除),m 数字(数字分削除),p(出力),q(終了)を入力してください。\n");

  while(1){
    fgets(input,10,stdin);
    sscanf(input,"%c %d",&command,&no);

    switch(command){
      case 'i':
        top = push(no,top);
        break;
      case 'd':
        top = pop(top);
        break;
      case 'm':
        for(int i = 0;i < no;i++){
          top = pop(top);
        }
        break;
      case 'p':
        while(top != NULL){
          top = pop(top);
          printf("%d",top);
        }
        break;
      case 'q':
        return 0;
    }
  }
  return 0;
}
