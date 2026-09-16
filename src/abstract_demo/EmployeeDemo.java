package abstract_demo;

// MAIN CLASS TO RUN PROGRAM
public class EmployeeDemo {

    public static void main(String[] args) {
        Developer dev = new Developer("DEV01", "Alice", 2000.0);

        dev.printInfo();
        System.out.println("Base Salary: $" + dev.calculateSalary());

        dev.doTask();
        System.out.println("Bonus: $" + dev.calculateBonus(dev.calculateSalary()));
    }
}
