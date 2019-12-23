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
  
  printf("数字を入力してください\n");
  scanf("%d",&no);
  printf("%d番目のフィボナッチ数は%dです\n",no,fib(no));	
  return 0;
}
