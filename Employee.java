package HashMapEmployees;

public class Employee {
    private String employeeName;
    private String salary;

    public Employee(){

    }

    public Employee(String employeeName, String salary){
        this.employeeName=employeeName;
        this.salary=salary;

    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getSalary(){
        return salary;
    }
}
