import java.io.*;
import java.util.*;

public class FileManagement{
  ScoreManagement Math = new ScoreManagement();
  ScoreManagement English = new ScoreManagement();

  // ファイルを読み込み科目ごとに保存
  public void read(String name){
    ArrayList<Integer> MathData = new ArrayList<Integer>();
    ArrayList<Integer> EnglishData = new ArrayList<Integer>();
    String data;

    try(BufferedReader reader = new BufferedReader(new FileReader(name));){
      while((data = reader.readLine()) != null){
        Scanner scan = new Scanner(data);
        scan.useDelimiter(","); // コンマ区切り
        if(scan.hasNextInt()){
          MathData.add(scan.nextInt());
          EnglishData.add(scan.nextInt());
        }
        scan.close();
      }
    }
    catch(IOException error){
      System.out.println("IO Error");
    }
    Math.calculate(MathData);
    English.calculate(EnglishData);
  }
  
  // それぞれの値を取得し別ファイルに書き込み
  public void write(String name){
    try(PrintWriter writer = new PrintWriter(name,"UTF-8");){
      writer.printf("        Math      English\n");
      writer.printf("max     %d        %d\n",Math.getMax(),English.getMax()); 
      writer.printf("min     %d        %d\n",Math.getMin(),English.getMin()); 
      writer.printf("average %f %f\n",Math.getAverage(),English.getAverage());
      writer.printf("median  %f %f\n",Math.getMedian(),English.getMedian());
    }
    catch(IOException error){
      System.out.println("IO Error");
    }
  }

  public static void main(String[] args){
    FileManagement file = new FileManagement();
    file.read("score.csv");
    file.write("scoredata.txt");
  }
}

