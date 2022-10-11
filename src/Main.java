public class Main {
    public static void getEmployeeList(Employee arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public static float getSalarySpending(Employee arr[]) {
        int totalSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSalary = totalSalary + arr[i].getSalary();
        }
        return totalSalary;
    }

    public static Employee getMinimalSalaryEmployee(Employee arr[]) {
        Employee minimalSalaryEmployee = new Employee("", 0, 1000000000);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < minimalSalaryEmployee.getSalary()) {
                minimalSalaryEmployee = arr[i];
            }
        }
        return minimalSalaryEmployee;
    }

    public static Employee getMaximalSalaryEmployee(Employee arr[]) {
        Employee maximalSalaryEmployee = new Employee("", 0, 0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() > maximalSalaryEmployee.getSalary()) {
                maximalSalaryEmployee = arr[i];
            }
        }
        return maximalSalaryEmployee;
    }

    public static void getAllEmployeeFullName(Employee arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
    }

    public static void main(String[] args) {
        Employee employee[] = new Employee[10]; ///Для простоты восприятия вместо ФИО подставил "Сотрудник, номер"
        employee[0] = new Employee("Сотрудник 1", 1, 54773);
        employee[1] = new Employee("Сотрудник 2", 5, 68455);
        employee[2] = new Employee("Сотрудник 3", 2, 73448);
        employee[3] = new Employee("Сотрудник 4", 3, 49955);
        employee[4] = new Employee("Сотрудник 5", 3, 45884);
        employee[5] = new Employee("Сотрудник 6", 1, 64433);
        employee[6] = new Employee("Сотрудник 7", 5, 78555);
        employee[7] = new Employee("Сотрудник 8", 4, 89633);
        employee[8] = new Employee("Сотрудник 9", 2, 75653);
        employee[9] = new Employee("Сотрудник 10", 4, 58963);

        System.out.println("   Вывод списка сотрудников");
        getEmployeeList(employee);
        System.out.println("   Сумма затрат на зарплаты");
        System.out.println("Всего на зарплату сотрудникам выделено - " + getSalarySpending(employee) + " руб.");
        System.out.println("   Мин. зарплата");
        System.out.println("Сотрудник с минимальной зарплатой - " + getMinimalSalaryEmployee(employee).getFullName() + ". Его зарплата равна - " + getMinimalSalaryEmployee(employee).getSalary() + " руб.");
        System.out.println("   Макс. зарплата");
        System.out.println("Сотрудник с максимальной зарплатой - " + getMaximalSalaryEmployee(employee).getFullName() + ". Его зарплата равно - " + getMaximalSalaryEmployee(employee).getSalary() + " руб.");
        System.out.println("   Среднее значение зарплат");
        float averageSpending = getSalarySpending(employee) / employee.length;
        System.out.println("Среднее значение зарплат - " + String.format("%.2f", averageSpending) + " руб.");
        System.out.println("   ФИО всех сотрудников");
        getAllEmployeeFullName(employee);
    }
}