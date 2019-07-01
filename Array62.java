public class Array62{
  public static void main(String[] args){
    int[] data= {100,50,200,100,0,200,102,40,30,100};
    show(data);
    System.out.println("合計：" + sum(data));
    System.out.println("平均：" + average(data));
    System.out.println("最大値：" + max(data));
    System.out.println("最大値を与える一番小さいインデックス：" + maxIndex(data));
    System.out.println("100 以上の個数：" + numGreater(data,100));
  }

  static void show(int... a){
    for(int i = 0;i < a.length;i++){
      System.out.print(a[i] + ", ");
    }
    
    System.out.println("");
  }

  static int sum(int[] a){
    int sum = 0;
    for(int i = 0;i < a.length;i++){
      sum += a[i];
    }

    return sum;
  }

  static int average(int[] a){
    return sum(a) / a.length
  }

  static int max(int[] a){
    int max = a[0];
    for(int i = 1;i < a.length;i++){
      if (a[i] > max){
        max = a[i];
      }
    }
    return max;
  }

  static int maxIndex(int[] a){
    int maxind = 0;
    for(int i = 1;i < a.length;i++){
      if (a[i] > a[maxind]){
        maxind = i;
      }
    }
    return maxind;
  }

  static int numGreater(int[] a,int n){
    int c = 0;
    for(int i = 0;i < a.length;i++){
      if (a[i] >= n){
        c++;
      }
    }
    return c;
  }
}
