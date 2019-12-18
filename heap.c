#include<stdio.h>

#define MAX 10

int heap[11] = {0,1,2,3,4,5,6,7};
int bottom = 7;

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
  }
  heap[index] = child;
}

int downheap(int index,int bottom){
  int parent = heap[index];
  int child = index * 2;

  while(child <= bottom){
    if((child < bottom) && (heap[child] < heap[child+1])){
      child++;
    }
    if(heap[child] <= parent){
      break;
    }
    heap[index] = heap[child];
    index = child;
    child = index * 2;
  }
  heap[index] = parent;
}

int getheap(){
  if(bottom < 1){
    printf("delete error\n");
  }
  int heapmax = heap[1];
  heap[1] = heap[bottom];
  heap[bottom] = 0;
  bottom--;
  downheap(1,bottom);
}

int  mkheap(){
  for(int i = 2;i < 8;i++){
    upheap(i);
  }
}

int putheap(int data){
  if(bottom == MAX){
    printf("heap hull\n");
  }
  else{
    bottom++;
    heap[bottom] = data;
    upheap(bottom);
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
        putheap(no);
        break;

      case 'd':
        getheap();
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
