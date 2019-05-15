package app;

import java.io.Serializable;

/**
 * @Author: Arkadiusz Brych
 * Company class that add and print eployees
 */
public class Company implements Serializable {
    public static final int MAX_EMPLOYEES = 3;
    private static final long serialVersionUID = 6222176388941112046L;
    private Employee[] employeeCompany = new Employee[MAX_EMPLOYEES];
    private int count = 0;

    void addEmployee(Employee employee) throws Exception {
        if (count == MAX_EMPLOYEES) {
            throw new Exception("Za duzo pracowników");
        }
        employeeCompany[count] = employee;
        count++;
    }

    void printEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employeeCompany[i].getName() + " " + employeeCompany[i].getSurname() + " " + employeeCompany[i].getSalary());
        }
    }
}