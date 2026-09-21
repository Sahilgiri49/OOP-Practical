class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int age, int empId) {
        super(name, age);
        this.empId = empId;
    }

    void showEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Arti", 20, 101);

        employee.displayDetails();
        employee.showEmployeeDetails();
    }
}