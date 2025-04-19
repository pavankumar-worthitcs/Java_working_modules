package Task_17_04_2025;

import StreamApi.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListQuestionUsingStream {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(136, "kartik", 12000.0));
        employeesList.add(new Employee(111, "Roman", 20000.0));
        employeesList.add(new Employee(109, "Rosy", 15000.0));
        employeesList.add(new Employee(103, "Clara", 12500.0));
        employeesList.add(new Employee(104, "Hema", 14000.0));
        employeesList.add(new Employee(106, "kartik", 12000.0));
        employeesList.add(new Employee(108, "Roman", 20000.0));
        employeesList.add(new Employee(107, "Rosy", 15000.0));
        employeesList.add(new Employee(110, "Clara1", 12500.0));
        employeesList.add(new Employee(113, "kartik", 12000.0));
        employeesList.add(new Employee(114, "Roman", 20000.0));
        employeesList.add(new Employee(115, "Rosy", 15000.0));
        employeesList.add(new Employee(120, "Clara", 12500.0));
        employeesList.add(new Employee(116, "Hema", 14000.0));
        employeesList.add(new Employee(118, "kartik", 12000.0));
        employeesList.add(new Employee(117, "Roman", 20000.0));
        employeesList.add(new Employee(121, "Rosy", 15000.0));
        employeesList.add(new Employee(122, "Clara1", 12500.0));
        employeesList.add(new Employee(124, "kartik", 12000.0));
        employeesList.add(new Employee(123, "Roman", 20000.0));
        employeesList.add(new Employee(119, "Rosy", 15000.0));
        employeesList.add(new Employee(125, "Clara", 12500.0));
        employeesList.add(new Employee(127, "Hema", 14000.0));
        employeesList.add(new Employee(128, "kartik", 12000.0));
        employeesList.add(new Employee(129, "Roman", 20000.0));
        employeesList.add(new Employee(130, "Rosy", 15000.0));
        employeesList.add(new Employee(131, "Clara1", 12500.0));

        System.out.print("Search: ");
        String searchKey = userInput.nextLine().toLowerCase();
        if (searchKey.isEmpty() || !searchKey.matches(".*[a-zA-Z0-9].*")) {
            System.out.println("Invalid searching ......");
            return;
        }

        System.out.print("Enter page size: ");
        int pageSize = userInput.nextInt();

        System.out.print("Enter page number starting from 1: ");
        int pageNumber = userInput.nextInt();

        if (pageNumber < 1) {
            System.out.println("Invalid page number");
            return;
        }


         List<Employee> pagedEmployees =employeesList.stream()
                .filter(employee -> employee.getEmployeeName().toLowerCase().contains(searchKey)|| String.valueOf(employee.getEmployeeId()).toLowerCase().contains(searchKey) || String.valueOf(employee.getEmployeeSalary()).toLowerCase().contains(searchKey))
                .sorted(Comparator.comparingInt(Employee::getEmployeeId))
                 .skip((long)pageNumber * pageSize)
                 .limit(pageSize)
                 .toList();

        if (pagedEmployees.isEmpty() && pageNumber > 1){
            System.out.println("Invalid page number");
            return ;
        }

        pagedEmployees.forEach(System.out::println);




    }
}
