package Java_8_To_21_Features;

import StreamApi.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class SwitchExpression {
    public static void main(String[] args) {

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(100, "kartik", 12000.0));
        employeesList.add(new Employee(111, "Roman", 20000.0));
        employeesList.add(new Employee(109, "Rosy", 15000.0));
        employeesList.add(new Employee(103, "Clara", 12500.0));
        employeesList.add(new Employee(104, "Hema", 14000.0));
        employeesList.add(new Employee(106, "kartik", 12000.0));
        employeesList.add(new Employee(108, "Roman", 20000.0));
        employeesList.add(new Employee(107, "Rosy", 15000.0));

        //if you want to sort any record based on userInput
        String user = "Name";

       Comparator<Employee> userDefinedSorting = switch(user){
            case "Id" -> comparingInt(Employee::getEmployeeId);
            case "Name" -> Comparator.comparing(Employee::getEmployeeName);
            default -> Comparator.comparingDouble(Employee::getEmployeeSalary);
       };

                               //(OR)

//        Comparator<Employee> userDefinedSorting = switch(user){
//            case "Id" : yield Comparator.comparingInt(Employee::getEmployeeId);
//            case "Name": yield Comparator.comparing(Employee::getEmployeeName);
//            default : yield  Comparator.comparingDouble(Employee::getEmployeeSalary);
//        };

       employeesList.sort(userDefinedSorting);
        System.out.println(employeesList);


    }

}
