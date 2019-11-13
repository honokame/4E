#include<stdio.h>
#include<stdlib.h>

typedef struct stack1{
  int data;
  struct stack1 *next;
  //struct stack1 *top = NULL;
} stack;
//stack *top = NULL;
//int stackdata[5];
//int stackpointer = 0;

stack *memory(void){
  return ((stack *) malloc(sizeof(stack)));
} 

stack *push(int x,stack *top){
  stack *p;
  p = memory();
  p->data = x;
  p->next = top;
  printf("push OK\n");
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
    printf("pop OK %d\n",x);
  }
  
  /*if(top != NULL){
    x  = top->data;
    top = top->next;
    printf("%d\n",x);
  }
  else
    printf("pop NG\n");
  */
  return top;
}

int main(void){
  //int stackdata[5];
  //int stackpointer = 0;
  stack *top = NULL;

  top = push(2,top);
  top = push(5,top);
  pop(top);

  return 0;
}
