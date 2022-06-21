package Coursework1;

import java.util.Arrays;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void listOfEmployees(Employee[] employees) {
            Arrays.stream(employees).forEach(System.out::println);

        }

        public static int salaryOfAllEmployees(Employee[] employees) {
            int sum = 0;
            for (Employee employee : employees) {
                sum += employee.getSalaryOfEmployee();
            }
            System.out.println("Сумма затрат на зарплаты в месяц составила " + sum + " рублей");
            System.out.println();

            return sum;
        }
        public static void staffWithMinSalary(Employee[] employees) {
            int minNum = employees[0].getSalaryOfEmployee();
            Employee staffInfo = employees [0];
            for (Employee employee : employees) {
                if (minNum > employee.getSalaryOfEmployee()) {
                    minNum = employee.getSalaryOfEmployee();
                    staffInfo = employee;
                }
            }
                System.out.println("Сотрудник с минимальной зарплатой " + staffInfo.getSalaryOfEmployee() + " рублей" + " - " + staffInfo.getFullName() + "," + " номер: " + staffInfo.getId());

            }
    public static void staffWithMaxSalary(Employee[] employees) {
        int maxNum = employees[0].getSalaryOfEmployee();
        Employee staffInfo = employees[0];
        for (Employee employee : employees) {
            if (maxNum < employee.getSalaryOfEmployee()) {
                maxNum = employee.getSalaryOfEmployee();
                staffInfo = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + staffInfo.getSalaryOfEmployee() + " рублей" + " - " + staffInfo.getFullName() + "," + " номер: " + staffInfo.getId());
    }
    public static void averageOfSalary(Employee[] employees) {
            double sum = salaryOfAllEmployees(employees);
            double average = sum/employees.length;
        System.out.println("Среднее значение зарплат сотрудников составляет: " + average + " рублей");
    }

    public static void fullNameOfStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("\nФИО сотрудника: \n" + employee.getFullName());
        }
   }



  public static void main(String[] args) {

            //Employee[] Employee = new Employee[10];
           // Employee[0] = new Employee("Иванов Иван Иванович", 1, 105_000);
           // Employee[1] = new Employee("Иванов Иван Петрович", 1, 100_000);
            //Employee[2] = new Employee("Сидоров Иван Иванович", 3, 84_000);
            //Employee[3] = new Employee("Зверев Михаил Иванович", 2, 300_000);
           // Employee[4] = new Employee("Клюева Людмила Петровна", 3, 250_000);
           // Employee[5] = new Employee("Иванов Егор Александрович", 5, 150_000);
           // Employee[6] = new Employee("Кузнецов Сергей Сергеевич", 4, 100_000);
           // Employee[7] = new Employee("Клоков Сергей Валерьевич", 2, 90_000);
           // Employee[8] = new Employee("Куркова Светлана Игоревна", 4, 95_000);
          //  Employee[9] = new Employee("Михалева Елена Александровна", 5, 100_000);

      //Employee[] employees = Employee[10];

      employees[0] = new Employee("Иванов Иван Иванович", 1, 105_000);
      employees[1] = new Employee("Иванов Иван Петрович", 1, 100_000);
      employees[2] = new Employee("Сидоров Иван Иванович", 3, 84_000);
      employees[3] = new Employee("Зверев Михаил Иванович", 2, 300_000);
      employees[4] = new Employee("Клюева Людмила Петровна", 3, 250_000);
      employees[5] = new Employee("Иванов Егор Александрович", 5, 150_000);
      employees[6] = new Employee("Кузнецов Сергей Сергеевич", 4, 100_000);
      employees[7] = new Employee("Клоков Сергей Валерьевич", 2, 90_000);
      employees[8] = new Employee("Куркова Светлана Игоревна", 4, 95_000);
      employees[9] = new Employee("Михалева Елена Александровна", 5, 100_000);

      listOfEmployees(employees);
      //System.out.println(Arrays.toString(Employee));
      salaryOfAllEmployees(employees);
     // staffWithMinSalary(Employee);
      //staffWithMaxSalary(Employee);
     // averageOfSalary(Employee);
     // fullNameOfStaff(Employee);

      staffWithMinSalary(employees);
      staffWithMaxSalary(employees);
      averageOfSalary(employees);
      fullNameOfStaff(employees);
    }
}
