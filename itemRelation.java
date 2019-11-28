import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class itemRelation{
  private Map<String,Integer> itemMap = new HashMap<>();

  public itemRelation(String name){
    String item,word;
    int value;

    try(BufferedReader reader = new BufferedReader(new FileReader(name));){
      while((item = reader.readLine()) != null){
        Scanner scan = new Scanner(item);
        scan.useDelimiter(" "); // 空白区切り

        // ファイルを読み込んでMapに保存
        // 以下の単語はnullに置き換え
        while(scan.hasNext()){
          word = scan.next();
          word = word.replace(".","");
          word = word.replace(",","");
          word = word.replace("(","");
          word = word.replace(")","");
          word = word.replace("[","");
          word = word.replace("]","");
          word = word.replace("\"","");
          word = word.replace("\0","");
          word = word.replace("\n","");
          word = word.replace(":","");
          if(itemMap.get(word) == null){ //
            value = 1;
            itemMap.put(word,value);
          }
          else{
            value = itemMap.get(word) + 1;
            itemMap.put(word,value);
          }
        }
        scan.close();
      }
    }
    catch(IOException error){
      System.out.println("IO Error");
    }
    // 以下の単語は削除
    itemMap.remove("");
    itemMap.remove("a");
    itemMap.remove("an");
    itemMap.remove("the");
    itemMap.remove("of");
    itemMap.remove("in");
    itemMap.remove("to");
  }

  public Set<String> getSet(){
    return itemMap.keySet();
  }

  public Map<String,Integer> getMap(){
    return itemMap;
  }

  // jaccard係数を取得
  // 引数はファイルの単語＞setA/Bに保存
  public static double getJaccard(Set<String> setA,Set<String> setB){
    Set<String> intersection = new HashSet<>(setA); 
    intersection.retainAll(setB); // 積集合

    Set<String> union = new HashSet<>(setA);
    union.addAll(setB); // 和集合

    double JaccardCoefficient = (double)intersection.size() / union.size();
    return JaccardCoefficient;
  }

  // Cosine類似度を取得
  // 引数は単語と単語の頻度＞mapA/Bに保存
  public static double getCosine(Map<String,Integer> mapA,Map<String,Integer> mapB){
    String key;
    double sizeA = 0.0,sizeB = 0.0,dotproduct = 0.0;

    for(Map.Entry<String,Integer> entry : mapA.entrySet()){
      key = entry.getKey();
      if(mapA.containsKey(key) && mapB.containsKey(key)){ 
        dotproduct += mapA.get(key) * mapB.get(key); // ドット積
      }
    }

    for(Map.Entry<String,Integer> entry : mapA.entrySet()){
      key = entry.getKey();
      sizeA += Math.pow(mapA.get(key),2); 
    }

    for(Map.Entry<String,Integer> entry : mapB.entrySet()){
      key = entry.getKey();
      sizeB += Math.pow(mapB.get(key),2); 
    }
    double CosineSimilarity = dotproduct / (Math.sqrt(sizeA) * Math.sqrt(sizeB));
    return CosineSimilarity;
  }

  public static void main(String[] args){
    double jaccard,cosine;
    itemRelation apple = new itemRelation("Apple - Wikipedia.html"); // setA,mapA
    itemRelation pear = new itemRelation("Pyrus pyrifolia - Wikipedia.html"); // setB,mapB
    jaccard = getJaccard(apple.getSet(),pear.getSet());
    cosine = getCosine(apple.getMap(),pear.getMap());
    System.out.println("jaccard = " + jaccard + "\ncosine = " + cosine);
  }
}
