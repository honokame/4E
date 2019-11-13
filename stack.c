#include<stdio.h>
#include<stdlib.h>
//#include<string.h>

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
  return top;
}

int main(void){
  stack *top = NULL;

  /*top = push(2,top);
  top = push(5,top);
  pop(top);
*/
  char input[20],command;
  int no;
  
  fgets(input,10,stdin);
  sscanf(input,"%c %d",&command,&no);
  
  switch(command){
    case 'i':
      printf("i\n");
      break;
    case 'd':
      printf("d\n");
      break;
    case 'm':
      printf("m\n");
      break;
    case 'p':
      printf("p\n");
      break;
    case 'q':
      printf("q\n");
      break;
  }
//  printf("%c\n",command);
//  printf("%d\n",no);
  return 0;
}
