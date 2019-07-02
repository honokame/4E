class GCsample1{ 
  public static void main(String[] args){ 
    while(true){ 
      String s = new String("abcde"); 
      System.out.println(Runtime.getRuntime().freeMemory()); 
    } 
  } 
}
