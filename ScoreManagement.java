import java.util.*;
import java.lang.Math.*;

public class ScoreManagement{
  private ArrayList<Integer> scoredata = new ArrayList<Integer>();
  private int max = 0,min = 0,size;
  private double average,median;
  public void save(ArrayList<Integer> data){
    scoredata = new ArrayList<Integer>(data);
    size = score.size();

    for(int i = 0;i < size;i++){
      max = Math.max(max,scoredata.get(i));
      min = Math.min(min,scoredata.get(i));
      average += scoredata.get(i);
    }
    
    average = average / scoredata.get(i);

    if((size % 2) == 0){
      median = (scoredata.get(size / 2) + scoredata.get(size / 2 - 1)) / 2;
    }
    else{
      median = scoredata.get(size / 2);
    }
  }

  public int getMax(){
    return max;
  }

  public int getMin(){
    return min;
  }

  public double getAvereage(){
    return average;
  }

  public double getMedian(){
    return median;
  }
}