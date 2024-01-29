import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String employeeId;
    private String name;
    private int age;
    private int salary;

    public Employee(String employeeId, String name, int age, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("161E90", "Ramu", 35, 59000));
        employees.add(new Employee("171E22", "Tejas", 30, 82100));
        employees.add(new Employee("171G55", "Abhi", 25, 100000));
        employees.add(new Employee("152K46", "Jaya", 32, 85000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting parameter:");
        System.out.println("1. Age");
        System.out.println("2. Name");
        System.out.println("3. Salary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(employees, Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                Collections.sort(employees, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employees, Comparator.comparingInt(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Sorted data:");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getSalary());
        }
    }
}
