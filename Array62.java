public class Array62{
  public static void main(String[] args){
    int[] data= {100,50,200,100,0,200,102,40,30,100}; // dataの初期値を代入
    show(data); // dataすべて表示
    System.out.println("合計：" + sum(data)); // dataの合計を表示
    // System.out.println("平均：" + average(data)); // dataの平均値を表示
    System.out.println("最大値：" + max(data)); // dataの最大値を表示
    // System.out.println("最大値を与える一番小さいインデックス：" + maxIndex(data)); // dataの最大値を保持しているインデックスを表示
    System.out.println("maxIndexは拡張されたfor文で書けない");
    System.out.println("100 以上の個数：" + numGreater(data,100)); // dataが100以上の要素数を表示 
  }

  // 配列要素を全て表示する
  static void show(int... a){
    for(int n:a){ // for(int i = 0;i < a.length;i++){
      System.out.print(n /* a[i] */ + ", ");
    }
    System.out.println(""); // 改行
  }
  
  // 配列要素の合計を返す
  static int sum(int[] a){
    int sum = 0;
    for(int n:a){ // for(int i = 0;i < a.length;i++){
      sum += n; // a[i];
    }
    return sum;
  }

  /*
  // 配列要素の平均値を返す
  static int average(int[] a){
    return sum(a) / a.length;
  }
  */

  // 配列要素の最大値を返す
  static int max(int[] a){
    int max = a[0];
    for(int n:a){ // for(int i = 1;i < a.length;i++){     
      // maxよりa[i]の方が大きければa[i]をmaxに代入
      if(n /* a[i] */ > max){
        max = n; // a[i];
      }
    }
    return max;
  }
  
  /*
  // 配列要素の最大値を保持しているインデックスを返す
  static int maxIndex(int[] a){
    int maxind = 0;
    for(int i = 1;i < a.length;i++){ 
      // a[maxind]よりa[i]の方が大きければiをmaxindに代入
      if (a[i] > a[maxind]){
        maxind = i;
      }
    }
    return maxind;
  }
  */

  // 配列要素がn以上の要素数を返す
  static int numGreater(int[] a,int n){
    int c = 0;
    for(int i:a){ // for(int i = 0;i < a.length;i++){
      // nよりa[i]が大きければcをカウント
      if (i /* a[i] */ >= n){
        c++;
      }
    }
    return c;
  }
}
