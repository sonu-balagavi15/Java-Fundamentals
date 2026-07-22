import java.util.*;
import java.io.*;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString(){

        return id + "," + name + "," + salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);

        ArrayList<Employee> employees=new ArrayList<>();

        int choice;

        do{

            System.out.println("\n===== Employee Management =====");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employees");
            System.out.println("3.Save to File");
            System.out.println("4.Exit");

            choice=sc.nextInt();

            switch(choice){

                case 1:

                    System.out.print("ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name=sc.nextLine();

                    System.out.print("Salary: ");
                    double salary=sc.nextDouble();

                    employees.add(new Employee(id,name,salary));

                    break;

                case 2:

                    for(Employee e:employees){

                        System.out.println(e);
                    }

                    break;

                case 3:

                    BufferedWriter bw=new BufferedWriter(new FileWriter("employees.txt"));

                    for(Employee e:employees){

                        bw.write(e.toString());
                        bw.newLine();
                    }

                    bw.close();

                    System.out.println("Saved Successfully.");

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        }while(choice!=4);

        sc.close();

    }
}