package lesson7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number Employee: ");
        int noEmployee = input.nextInt();
        Employee[] employees = new Employee[noEmployee];
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter 1(Full time) or 2(part time): ");
            int number = input.nextInt();
            input.nextLine();
            if (number == 1) {
                System.out.print("Name: " );
                String name = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("Id: ");
                String id = input.nextLine();
                employees[i] = new FulltimeEmployee(name, age, id);
                System.out.println("-----------------");
            } else   {
                System.out.print("Name: " );
                String name = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("Id: ");
                String id = input.nextLine();
                employees[i] = new PartimeEmployee(name, age, id);
                System.out.println("-----------------");
            }
        }
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInformation();
        }
        EmployeeManagement management = new EmployeeManagement(employees, noEmployee);
        management.printLowestSalary();
        management.printHighestSalary();
    }
}
