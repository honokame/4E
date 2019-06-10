public class Ex62{
  public static void main(String[] args){
    Student st = new Student();
    st.setStudent("e0000"); // setStudentにe0000を渡す
    st.setStudent(91.5); // setStudentに91.5を渡す
    st.display(); // 表示する
    st.setStudent("e0001",65.1); // setStudentにe0001,65.1を渡す
    st.display(); // 表示する
  }
}
