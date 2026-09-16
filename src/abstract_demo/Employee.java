package abstract_demo;

// ABSTRACT CLASS: Common superclass representing an Employee
public abstract class Employee {

    private String id;
    private String name;

    // Abstract classes CAN have constructors
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Concrete method
    public void printInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    // Abstract method
    public abstract double calculateSalary();
}
