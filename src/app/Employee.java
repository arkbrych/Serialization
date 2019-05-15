package app;

/**
 * @Author: Arkadiusz Brych
 * Employee class extends Person with Salary
 */
public class Employee extends Person {
    private int salary;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }
}
