#include<stdio.h>

int fib(int no){
  int i=1,j=0;

  for(int k = 1;k <= no;k++){
    j = j + i;
    i = j - i;
  }
  return j;
}

int main(void){
  int no;

  while(1){
    scanf("%d",&no);
    printf("%d\n",fib(no));	
  }
  return 0;
}
