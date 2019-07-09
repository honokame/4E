public class Args61{
  public static void main(String[] args){
    System.out.println(args.length + "個の引数：");
    for(int i = 0;i < args.length;i++){
      System.out.println(i + "番目の引数" + args[i]);
    }
  }
}
