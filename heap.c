#include<stdio.h>

int heap[11] = {0,1,2,3,4,5,6,7};

int upheap(int index){
  int child = heap[index];
  int parent = index / 2;

  while(parent >= 1){
    if(heap[parent] >= child){
      break;
    }
    else{
      heap[index] = heap[parent];
      index = parent;
      parent = index / 2;
    }
    heap[index] = child;
  }
}

int  mkheap(){
  for(int i = 2;i < 8;i++){
    upheap(i);
  }
}
int main(void){
  char input[20],command;
  int no;
  
  mkheap();

  while(1){
    fgets(input,10,stdin);
    sscanf(input,"%c%d",&command,&no);

    switch(command){
      case 'i':
        break;

      case 'd':
        break;

      case 'p':
        for(int i = 1;i < 11;i++){
          printf("%d",heap[i]);
        }
        printf("\n");
        break;

      case 'q':
        return 0;

      default:
        printf("i数字(数字を挿入),d(最大値削除),p(出力),q(終了)を入力してください\n");
        break;
    }
  }
  return 0;
}
