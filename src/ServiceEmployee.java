import java.util.Scanner;

public class ServiceEmployee {
    Employee[] employees;

    public ServiceEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public void menu(int command) {
        Scanner in = new Scanner(System.in);
        switch (command) {
            case 1:
                for (int i = 0; i < employees.length; i++) {
                    System.out.printf("ID: %d ФИО: %s департамент: %d ЗП: %s%n", employees[i].getNumber(),
                            employees[i].getFullName(), employees[i].getDepartment(), employees[i].getWage());
                }
                System.out.println();
                break;
            case 2:
                int costs = 0;
                for (int i = 0; i < employees.length; i++) {
                    costs += employees[i].getWage();
                }
                System.out.println("Cумма затрат на запрлаты: " + costs);
                System.out.println();
                break;
            case 3:
                double min = employees[0].getWage();
                for (int i = 1; i < employees.length; i++) {
                    if (min > employees[i].getWage()) {
                        min = employees[i].getWage();
                    }
                }
                System.out.println("Сотрудник с min ЗП: " + min);
                System.out.println();
                break;
            case 4:
                double max = employees[0].getWage();
                for (int i = 1; i < employees.length; i++) {
                    if (max < employees[i].getWage()) {
                        max = employees[i].getWage();
                    }
                }
                System.out.println("Сотрудник с max ЗП: " + max);
                System.out.println();
                break;
            case 5:
                int average;
                int sum = 0;
                for (int i = 0; i < employees.length; i++) {
                    sum += employees[i].getWage();
                }
                average = sum / 3;
                System.out.println("Среднее ЗП: " + average);
                System.out.println();
                break;
            case 6:
                System.out.println("Введите ID сотрудника: ");
                int idNumber = in.nextInt();
                for (int i = 0; i < employees.length; i++) {
                    if (employees[i].getNumber() == idNumber) {
                        System.out.println(String.format("ID: %d ФИО: %s департамент: %d ЗП: %.2f", employees[i].getNumber(),
                                employees[i].getFullName(), employees[i].getDepartment(), employees[i].getWage()));
                    }
                }
                System.out.println();
                break;

            case 7:
                System.out.println("Введите % индексации: ");
                int number = in.nextInt();
                for (int i = 0; i < employees.length; i++) {
                    double percentage = ((double) number/100)+1;
                    employees[i].setWage((employees[i].getWage()*percentage));
                    System.out.println(String.format("ID: %d ФИО: %s департамент: %d ЗП: %.2f", employees[i].getNumber(),
                            employees[i].getFullName(), employees[i].getDepartment(), employees[i].getWage()));
                }
                System.out.println();
                break;

            case 8:
                break;

            default:
                throw new RuntimeException("Ошибка ввода");
        }
    }
}
