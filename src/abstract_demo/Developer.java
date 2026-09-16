package abstract_demo;

// CONCRETE SUBCLASS: Extends Abstract Class AND implements multiple Interfaces
public class Developer extends Employee implements Workable, BonusCalculable {

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
