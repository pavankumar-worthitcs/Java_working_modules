package StreamApi;

public class Employee{
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
