package abstract_demo;

// --- 1. INTERFACE 1: Defines work capability ---
interface Workable {

    void doTask(); // implicitly public abstract
}

// --- 2. INTERFACE 2: Defines bonus calculation capability ---
interface BonusCalculable {

    double BONUS_RATE = 0.15; // implicitly public static final

    double calculateBonus(double salary);
}

// --- 3. ABSTRACT CLASS: Common superclass representing an Employee ---
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

// --- 4. CONCRETE SUBCLASS: Extends Abstract Class AND implements multiple Interfaces ---
class Developer extends Employee implements Workable, BonusCalculable {

    private double baseSalary;

    public Developer(String id, String name, double baseSalary) {
        super(id, name); // Call parent constructor
        this.baseSalary = baseSalary;
    }

    // Override abstract method from Employee
    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    // Override method from Workable interface (must be public)
    @Override
    public void doTask() {
        System.out.println(getName() + " is writing Java code in NetBeans...");
    }

    // Override method from BonusCalculable interface
    @Override
    public double calculateBonus(double salary) {
        return salary * BONUS_RATE;
    }
}

// --- 5. MAIN CLASS TO RUN PROGRAM ---
class Main {

    public static void main(String[] args) {
        Developer dev = new Developer("DEV01", "Alice", 2000.0);

        dev.printInfo();
        System.out.println("Base Salary: $" + dev.calculateSalary());

        dev.doTask();
        System.out.println("Bonus: $" + dev.calculateBonus(dev.calculateSalary()));
    }
}