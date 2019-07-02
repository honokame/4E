class GCsample2{ 
  public static void main(String[] args){ 
    while(true){ 
      for(int i=0; i<10; i++){ 
        String s = new String("abcde"); 
        System.out.println(Runtime.getRuntime().freeMemory()); 
      } 
      System.gc(); 
      System.out.println(Runtime.getRuntime().freeMemory() + "AfterGC"); 
    }
  } 
}
