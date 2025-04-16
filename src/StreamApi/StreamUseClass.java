package StreamApi;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUseClass {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student(101,"peter",65,60));
        students.add(new Student(102,"Salt",86,78));
        students.add(new Student(103,"philip",72,76));
        students.add(new Student(104,"Mark",68,72));

           Set<Student> sortedStudents =students.stream()
                .sorted((studentPrev,studentNext)-> studentPrev.getStudentMarks() - studentNext.getStudentMarks())
                 .filter(student -> student.getStudentMarks() > 70)
                 .collect(Collectors.toSet());

           sortedStudents.forEach(System.out::println);
    }




}
class Student{

    private int studentId;
    private String studentName;
    private int studentMarks;
    private int studentAttendance;

    public Student( int studentId,String studentName, int studentMarks, int studentAttendance) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentMarks = studentMarks;
        this.studentAttendance = studentAttendance;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public int getStudentAttendance() {
        return studentAttendance;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public void setStudentAttendance(int studentAttendance) {
        this.studentAttendance = studentAttendance;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentAttendance=" + studentAttendance +
                '}';
    }
}
