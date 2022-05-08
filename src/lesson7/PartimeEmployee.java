package lesson7;

public class PartimeEmployee extends Employee {
    final static long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;

    public PartimeEmployee(String name,int age,String id) {
        super(name, age, id);
        this.totalWorkingShift = 10 + (int)(Math.random() * 22); // Working shift from 10 to 31
        this.baseSalary = 30000 + (long)(Math.random() * 5) * 10000; // Salary from 30.000 to 70.000
    }


    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long calculateSalary() {
        return getWorkingCount() * getSalaryRate() + this.getMealAllowance();
    }

    public void printInformation() {
        System.out.println(
                "Name: " + getName() + "\r\n" +
                "Age: " + getAge() + "\r\n" +
                "Id: " + getId() + "\r\n" +
                "Total Working: " + getWorkingCount() + "\r\n" +
                "Salary is: " + calculateSalary() + "\r\n" +
                "-----------------"
        );
    }
}
