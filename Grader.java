public class Grader{

  public static void main(String[] args) {
    int nilai = Integer.parseInt(args[0]);
    String grade = "";
    try {
      if(nilai<0 || nilai>100) {
        grade = "Number out of range.";
      } else if(nilai<=20) {
        grade = "E";
      } else if(nilai<=40) {
        grade = "D";
      } else if(nilai<=60) {
        grade = "C";
      } else if(nilai<=80) {
        grade = "B";
      } else if(nilai<=100) {
        grade = "A";
      }
      System.out.println("Nilai: " + grade);
    } catch (Exception e) {
      System.out.println("Input error");
    }
  }
}
