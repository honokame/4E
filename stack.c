#include<stdio.h>

typedef struct satck1{
  int data;
  struct satck1 *next;
  //struct satck1 *top = NULL;
} stack;


stack *memory(void){
  return ((stack *) malloc(sizeof(stack)));
}

stack *push(int x,satck *top){
  stack *p;
  p = memory();
  p->data = x;
  p->next = top;
  return p;
}
