package lesson7;

public abstract class Employee {
    private String name;
    private int age;
    private String id;

    protected Employee(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public abstract long getMealAllowance();

    public abstract long getSalaryRate();

    public abstract int getWorkingCount();

    public long calculateSalary() {
         return getWorkingCount() * getSalaryRate() + getMealAllowance();
    }

    public abstract void printInformation();
}
