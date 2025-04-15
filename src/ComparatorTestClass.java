import java.util.ArrayList;

public class ComparatorTestClass {
    public static void main(String[] args) {
        ArrayList<Student> s_list = new ArrayList<>();
        s_list.add(new Student(111,"Peter",30000.0));
        s_list.add(new Student(112,"Shawn",28000.0));
        s_list.add(new Student(113,"Marsh",32000.0));
        s_list.add(new Student(114,"Travis",29000.0));
        s_list.add(new Student(115,"David",34000.0));


        //Before sorting the list
        System.out.println(s_list);

        //sorting the student alphabetically of their first character of name
        s_list.sort((o1, o2) -> {  //provided the sort implementation using comparator with the help of lambda expression.

            return Character.compare(o1.studentName.charAt(0), o2.studentName.charAt(0));
        });

        //After Sorting the list
        System.out.println(s_list);

    }
}


class Student{
    int studentId;
    String studentName;
    double studentFees;

    public Student(int studentId, String studentName, double studentFees) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFees = studentFees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentFees=" + studentFees +
                '}';
    }
}
