public class Employee {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : ₹" + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1001, "Rahul", 45000);

        e1.displayEmployee();
    }
}