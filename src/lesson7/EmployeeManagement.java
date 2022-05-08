package lesson7;
public class EmployeeManagement {
    private Employee[] employees;

    public EmployeeManagement(Employee[] employees, int n) {
        this.employees = employees;
    }

    public void getInformation() {
        for (Employee employee: employees) {
            employee.printInformation();
            }
    }

    public void printHighestSalary() {
        long highest = employees[0].calculateSalary();
        int maxIndex = 0;
        for (int i = 1; i < employees.length; i++) {
            if (highest < employees[i].calculateSalary()) {
                highest = employees[i].calculateSalary();
                maxIndex = i;
            }
        }
        System.out.println("Employee with highest Salary: " + "\r\n" +
                            "Name: " + employees[maxIndex].getName() + "\r\n" +
                            "Salary : " + highest);
    }

    public void printLowestSalary() {
        long lowest = employees[0].calculateSalary();
        int minIndex = 0;
        for (int i = 1; i < employees.length; i++) {
            if (lowest > employees[i].calculateSalary()) {
                lowest = employees[i].calculateSalary();
                minIndex = i;
            }
        }
        System.out.println("Employee with lowest Salary: " + "\r\n" +
                            "Name: " + employees[minIndex].getName() + "\r\n" +
                            "Salary : " + lowest);
    }
}
