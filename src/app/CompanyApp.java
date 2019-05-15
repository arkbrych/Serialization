package app;

import java.io.*;

/**
 * @Author: Arkadiusz Brych
 * CompanyApp main class for Serialization application
 */

public class CompanyApp {

    public static void main(String[] args) throws Exception{
        Employee employee1 = new Employee("Arkadiusz", "Brych", 1600);
        Employee employee2 = new Employee("Piotr", "Kraska", 1600);
        Employee employee3 = new Employee("Anna", "Bartocha", 1600);
        Company company = new Company();

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        objectWriter(company);
        objectReader();
    }


    // Create and write file
    private static void objectWriter(Company company) {
        String fileName = "employee.obj";

        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
        ) {
            os.writeObject(company);
            System.out.println("File saved");
        } catch (IOException e) {
            System.out.println("Error" + fileName);
            e.printStackTrace();
        }
    }

    // Read file
    private static void objectReader() {
        String fileName = "employee.obj";
        Company company = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
        ) {
            company = (Company) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Error");
            e.printStackTrace();
        }

        if (company != null) {
            System.out.println("File loaded o: ");
            company.printEmployees();
        }
    }
}
