#include<stdio.h>
#include<stdlib.h>

typedef struct stack1{
  int data;
  struct stack1 *next;
//  struct stack1 *top = NULL;
} stack;

struct stack *top = NULL;

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
    printf("pop OK %d\n",x);
  }
  return top;
}

int main(void){
  return 0;
}
