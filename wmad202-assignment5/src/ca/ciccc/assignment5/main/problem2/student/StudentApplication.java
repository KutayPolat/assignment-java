package ca.ciccc.assignment5.main.problem2.student;

public class StudentApplication {
   public void runApplication() {
       Student student = new Student("whats going on here ?", "nothing");
       student.ask();
       student.printAnswer();
   }
}
