public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 0;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID сотрудника - " + this.id + ", ФИО - " + getFullName() + ", отдел - " + getDepartment() + ", зарплата - " + getSalary() + " руб.";
    }

    public void setDepartment(int newDepartment) {
        this.department = newDepartment;
    }
    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }
}

