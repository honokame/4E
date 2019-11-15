#include<stdio.h>
#include<stdlib.h>

// メイン関数
int main(void){
  char input[20],command;
  int no;

  fgets(input,10,stdin); // 入力読み取り
  sscanf(input,"%c%d",&command,&no); // 文字と数字に変換

  switch(command){
    case 'i': // 挿入
      break;

    case 'd': // 削除
      break;

    case 'p': // 表示
      break;

    case 'q': // 終了
      return 0;

    default: // 例外入力
      printf("i数字(数字を挿入),d(削除),p(出力),q(終了)を入力してください");
      break;
  }
  return 0;
}
