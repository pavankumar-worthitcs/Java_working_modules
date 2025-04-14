import java.util.ArrayList;
import java.util.Collections;

public class ComparableTestClass {

    public static void main(String[] args) {

        ArrayList<Employee> e_list = new ArrayList<>();
        e_list.add(new Employee(104,"Pavan",35000.0));
        e_list.add(new Employee(106,"Mahesh",38000.0));
        e_list.add(new Employee(101,"Sai",25000.0));
        e_list.add(new Employee(100,"steve",32000.0));

        System.out.println("Before sorting : "+e_list);
        Collections.sort(e_list); // it will arrange the employees based on their id's.
        System.out.println("After sorting : "+e_list);

    }
}

class Employee implements Comparable<Employee>{
    int employeeId;
    String employeeName;
    double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return this.employeeId - e.employeeId;
    }
}
