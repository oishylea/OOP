//ArrayList

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("Dr. Nor Sabrina", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("En Ahmad", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Prof M Izzudin", 66666, "Consultation", "Manager");
        Employee emp4 = new Employee("Dr N Izzati", 34521, "Elect&Etronic", "CEO");
        Employee emp5 = new Employee("Dr A Rahman", 12321, "PR", "Manager");

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("-----All Employees-----");
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + "\nPosition: " + employee.getPosition()+"\n");
        }
        System.out.println();

        System.out.println("Contains 'Dr N Izzati': " + employeeList.contains(emp3));
        System.out.println("Is list empty? : " + employeeList.isEmpty());
        System.out.println("List size : " + employeeList.size());
        employeeList.set(2, new Employee("Prof. M. Izzudin", 11511, "Human Resource", "Senior Manager"));
        employeeList.remove(4);

        System.out.println("\n-----Modified Employee List-----");
        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName() + "\nPosition: " + employee.getPosition()+"\n");
        }
    }
}

class Employee {
    private String name;
    private int employeeId;
    private String department;
    private String position;

    public Employee(String name, int employeeId, String department, String position) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}