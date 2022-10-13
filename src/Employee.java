public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID сотрудника - " + id + ", ФИО - " + getFullName() + ", отдел - " + getDepartment() + ", зарплата - " + getSalary() + " руб.";
    }

    public void setFullName(String newFullName) {
        this.fullName = newFullName;
    }

    public void setDepartment(int newDepartment) {
        this.department = newDepartment;
    }
    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }
    public void setId(int newID) {
        this.id = newID;
    }
}

