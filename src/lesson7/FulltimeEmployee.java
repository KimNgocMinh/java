package lesson7;

public class FulltimeEmployee extends Employee {
    final static long MEAL_ALLWANCE = 2000000;
    private int totalWorkingDay;
    private long dailySalary;

    public FulltimeEmployee(String name, int age, String id) {
        super(name, age, id);
        this.totalWorkingDay = 10 + (int)(Math.random() * 22);// Working day from 10 to 31
        this.dailySalary =150000 + ((long)(Math.random() * 186)) * 10000; // Salary from 150.000 to 2.000.000
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLWANCE;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDay;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
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
