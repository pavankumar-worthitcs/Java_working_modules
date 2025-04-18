package Task_17_04_2025;
import StreamApi.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleListOptimization {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(100, "kartik", 12000.0));
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
        // Filter the employees that match the search
        List<Employee> matchedEmployees = new ArrayList<>();
        for (Employee emp : employeesList) {
            if (String.valueOf(emp.getEmployeeId()).contains(searchKey) || emp.getEmployeeName().toLowerCase().contains(searchKey) ||
                    String.valueOf(emp.getEmployeeSalary()).contains(searchKey)) {
                matchedEmployees.add(emp);
            }
        }
        int totalMatchedEmployees = matchedEmployees.size();
        if (totalMatchedEmployees == 0) {
            System.out.println("No matching records found.");
            return;
        }
        int totalPages = (int) Math.ceil((double) totalMatchedEmployees / pageSize);
        if (pageNumber > totalPages) {
            System.out.println("Invalid page number");
            return;
        }
        int fromIndex = (pageNumber - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, totalMatchedEmployees);
        for (int i = fromIndex; i < toIndex; i++) {
            System.out.println(matchedEmployees.get(i));
        }
    }

}
