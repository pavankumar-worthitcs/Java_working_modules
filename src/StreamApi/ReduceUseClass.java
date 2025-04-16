package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class ReduceUseClass {

    public static void main(String[] args) {


        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(100,"kartik",12000.0));
        employeesList.add(new Employee(101,"Roman",20000.0));
        employeesList.add(new Employee(102,"Rosy",15000.0));
        employeesList.add(new Employee(103,"Clara",12500.0));
        employeesList.add(new Employee(104,"Hema",14000.0));

        //if we want to know sum of the employee salary's, then we can go for reduce() of stream api
         Double sumOfTheEmployeeSalaries = employeesList.stream() //converting into stream
                .map(Employee::getEmployeeSalary) //Fetching only the Employees salaries
                .reduce(0.0,Double::sum); //adding all salaries by method reference, starting from 0.0

        System.out.println("Total sum of Employee salaries : "+sumOfTheEmployeeSalaries);
    }





}
class Employee{
    private int EmployeeId;
    private String EmployeeName;
    private double EmployeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        EmployeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeSalary=" + EmployeeSalary +
                '}';
    }
}
