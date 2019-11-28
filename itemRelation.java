import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class itemRelation{
  private Map<String,Integer> itemMap = new HashMap<>();
  public itemRelation(String name){
    String item,word;

    try(BufferedReader reader = new BufferedReader(new FileReader(name));){
      while((item = reader.readLine()) != null){
        Scanner scan = new Scanner(item);
        scan.useDelimiter(" ");
        
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

          if(itemMap.get(word) == null) {
            itemMap.put(word,1);
          }
          else{
            itemMap.put(word,itemMap.get(word) + 1);
          }
        }
        scan.close();
      }
    }
    catch(IOException error){
      System.out.println("IO Error");
    }
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

  public static double getJaccard(Set<String> setA,Set<String> setB){
    Set<String> intersection = new HashSet<>(setA);
    intersection.retainAll(setB);

    Set<String> union = new HashSet<>(setA);
    union.addAll(setB);

    double JaccardCoefficient = (double)intersection.size() / union.size();
    return JaccardCoefficient;
  }

  public static double getCosine(Map<String,Integer> mapA,Map<String,Integer> mapB){
    String key;
    double sizeA = 0.0,sizeB = 0.0,dotproduct = 0.0;

    for(Map.Entry<String,Integer> entry : mapA.entrySet()){
      key = entry.getKey();
      if(mapA.containsKey(key) && mapB.containsKey(key)){ 
        dotproduct += mapA.get(key) * mapB.get(key);
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
    itemRelation apple = new itemRelation("Apple - Wikipedia.html");
    itemRelation pear = new itemRelation("Pyrus pyrifolia - Wikipedia.html");
    jaccard = getJaccard(apple.getSet(),pear.getSet());
    cosine = getCosine(apple.getMap(),pear.getMap());
    System.out.println("jaccard = " + jaccard + "\ncosine = " + cosine);
  }
}
