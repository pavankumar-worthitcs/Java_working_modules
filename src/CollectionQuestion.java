import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionQuestion {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Search :  ");
        String searchKey = userInput.nextLine().toLowerCase();
        System.out.print("Enter page Size : ");
        int pageSize = userInput.nextInt();
        if(searchKey.isEmpty() || pageSize == 0) return;
        System.out.println("Enter page number : ");
        int pageNumber = userInput.nextInt();
        if(pageNumber == 0){
            System.out.println("Entered page is Not valid");
            return;
        }
        int count = 1;
        int index = 0;

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

        List<List<Employee>> pageLayout = new ArrayList<>();
        for (Employee employeeFromList : employeesList) {
            String strId = String.valueOf(employeeFromList.employeeId);
            String strName = employeeFromList.employeeName;
            String strSalary = String.valueOf(employeeFromList.employeeSalary);
            if (strId.contains(searchKey) || strName.contains(searchKey) || strSalary.contains(searchKey)) {
                if (pageLayout.isEmpty()) {
                    pageLayout.add(new ArrayList<>());
                }
                if (count > pageSize) {
                    pageLayout.add(new ArrayList<>());
                    index++;
                    count = 1;
                }
                pageLayout.get(index).add(employeeFromList);
                count++;
            }
        }
        if (pageNumber > 0 && pageNumber <= pageLayout.size()) {
            for (Employee finalEmployee : pageLayout.get(pageNumber - 1))
                System.out.println(finalEmployee);
        } else
            System.out.println("Enter valid page number");
    }


}


