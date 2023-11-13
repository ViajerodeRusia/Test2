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
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Joseph Aulsford", 5, 9000);
        employees[1] = new Employee("Richard Selby", 6, 10000);
        employees[2] = new Employee("Cheston Furrow", 6, 11000);

        Scanner in = new Scanner(System.in);
        System.out.println("1. Получить список всех сотрудников.\n" +
                "2. Посчитать сумму затрат на зарплаты.\n" +
                "3. Найти сотрудника с минимальной заплатой.\n" +
                "4. Найти сотрудника с максимальной зарплатой.\n" +
                "5. Подсчитать среднее значение зарплат.\n" +
                "6. Вывод по id. \n" +
                "7. Индексация зарплат. \n" +
                "8. Выход.");
        int command = in.nextInt();
        ServiceEmployee serviceEmployee = new ServiceEmployee(employees);
        serviceEmployee.menu(command);
    }
}