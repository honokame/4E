public class Student{
  private String studentID;
  private double score;

  // studentIDを代入
  public void setStudentID(String studentID){
    this.studentID = studentID;
  }

  // studentIDを返す
  public String getStudent(){
    return studentID;
  }
  
  // scoreを代入(0以上)
  public void setScore(double score){
    if(score > 0){
      this.score = score;
    }
  }

  // scoreを返す
  public double getScore(){
    return score;
  }
  
  // settudentIDにstudentIDを渡す
  public void setStudent(String studentID){
    setStudentID(studentID);
  }

  //  setScoreにscoreを渡す
  public void setStudent(double score){
    setScore(score);
  }
  
  // setStudet、setScoreにstudentID、scoreを渡す
  public void setStudent(String studentID,double score){
    setStudentID(studentID);
    setScore(score);
  }

  // 表示
  public void display(){
    // 学籍番号表示
    System.out.println("学籍番号は"+studentID+"です。");
    
    // 得点表示
    if(score > 0){
      System.out.println("得点は"+score+"です。");
    }
    else{
      System.out.println("値が無効です（score）");
    }
  }
}

 
