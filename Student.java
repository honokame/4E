public class Student{
  private String studentID;
  private double score;

  public void setStudentID(String studentID){
    this.studentID = studentID;
  }

  public String getStudent(){
    return studentID;
  }
  
  public void setScore(double score){
    if(score > 0){
      this.score = score;
    }
    else{
      System.out.println("値が無効です");
    }
  }

  public double getScore(){
    return score;
  }
  
  public void setStudent(String studentID){
    this.studentID = studentID;
  }

  public void setStudent(double score){
    this.score = score;
  }

  public void setStudent(String studentID,double score){
    this.studentID = studentID;
    this.score = score;
  }

  public void display(){
    System.out.println("学籍番号は"+studentID+"です。");
    System.out.println("得点は"+score+"です。");
  }
}

 
