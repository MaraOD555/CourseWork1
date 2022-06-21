package Coursework1;

public class Employee {

    private final String fullName;
    private int department;
    private int salaryOfEmployee;
    static int count = 0;
    private final int id;

    public Employee(String fullName, int department, int salaryOfEmployee) {
        this.fullName = fullName;
        this.department = department;
        this.salaryOfEmployee = salaryOfEmployee;
        this.id = count++;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalaryOfEmployee() {
        return salaryOfEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaryOfEmployee(int salaryOfEmployee) {
        this.salaryOfEmployee = salaryOfEmployee;
    }

    @Override
    public String toString() {
       return "ФИО сотрудника: " + fullName + ", " + " Отдел: " + department + ", " + " Заработанная плата: " + salaryOfEmployee + ", " +
                "номер " + getId() + "; ";
       }
}
