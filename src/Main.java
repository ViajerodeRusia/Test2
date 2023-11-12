import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        /*
        Описание задачи:
        Напишите программу, которая занимается учетом сотрудников и помогает кадрам и бухгалтерии автоматизировать процессы.
        С помощью вашей программы бухгалтерия и отдел кадров смогут узнавать следующую информацию:
        1. Получить список всех сотрудников.
        2. Посчитать сумму затрат на зарплаты.
        3. Найти сотрудника с минимальной заплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат.
        */
        Employee [] employeeList = new Employee[3];
        employeeList[0] = new Employee("Joseph Aulsford", 5, 9000);
        employeeList[1] = new Employee("Richard Selby", 6, 10000);
        employeeList[2] = new Employee("Cheston Furrow", 6, 11000);

        Scanner in = new Scanner(System.in);
        System.out.println("1. Получить список всех сотрудников.\n" +
                "2. Посчитать сумму затрат на зарплаты.\n" +
                "3. Найти сотрудника с минимальной заплатой.\n" +
                "4. Найти сотрудника с максимальной зарплатой.\n" +
                "5. Подсчитать среднее значение зарплат.\n" +
                "6. Вывод по id. \n" +
                "7. Выход.");
        int command = in.nextInt();
        switch (command) {
            case 1:
             for (int j=0; j<employeeList.length; j++) {
                 System.out.println("ID: " + employeeList[j].getNumber() +
                         " ФИО: " + employeeList[j].getFullName() +
                         " департамент: "+ employeeList[j].getDepartment()+
                         " ЗП: " + employeeList[j].getWage());
             }
             System.out.println();
             break;
            case 2:
             int costs = 0;
             for (int j=0; j<employeeList.length; j++) {
                 costs += employeeList[j].getWage();
             }
             System.out.println("Cумма затрат на запрлаты: " + costs);
             System.out.println();
             break;
            case 3:
             int min = employeeList[0].getWage();
             for (int j=1; j<employeeList.length; j++) {
                 if (min>employeeList[j].getWage()) {
                     min=employeeList[j].getWage();
                 }
             }
             System.out.println("Сотрудник с min ЗП: " + min);
             System.out.println();
             break;
            case 4:
                int max = employeeList[0].getWage();
                for (int j=1; j<employeeList.length; j++) {
                    if (max<employeeList[j].getWage()) {
                        max=employeeList[j].getWage();
                    }
                }
                System.out.println("Сотрудник с max ЗП: " + max);
                System.out.println();
                break;
            case 5:
                int average;
                int sum = 0;
                for (int j = 0; j<employeeList.length; j++) {
                    sum+= employeeList[j].getWage();
                }
                average = sum/3;
                System.out.println("Среднее ЗП: " + average);
                System.out.println();
                break;
            case 6:
                System.out.println("Введите ID сотрудника: ");
                int idNumber = in.nextInt();
                for (int j = 0; j<employeeList.length; j++) {
                    if (employeeList[j].getNumber() == idNumber) {
                        System.out.println("ID: " + employeeList[j].getNumber() + " ФИО: " + employeeList[j].getFullName() +
                                " департамент: "+ employeeList[j].getDepartment()+
                                " ЗП: " + employeeList[j].getWage());
                    }
                }
                System.out.println();
                break;
            case 7:
                break;

            default:
                throw new RuntimeException("Ошибка ввода");
        }
    }
}