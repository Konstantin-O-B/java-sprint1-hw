import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();
        MonthData monthData = new MonthData
        while (command != 0) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите номер месяца:" +
                        "1 - Январь" +
                        "2 - Февраль" +
                        "3 - Март" +
                        "4 - Апрель" +
                        "5 - Май" +
                        "6 - Июнь" +
                        "7 - Июль" +
                        "8 - Август" +
                        "9 - Сентябрь" +
                        "10 - Октябрь" +
                        "11 - Ноябрь" +
                        "12 - Декабрь");
                int i = scanner.nextInt();
                System.out.println("Введите день месяца с 1 по 30:");
                int j  = scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int steps = scanner.nextInt();
                monthData.steps(i, j, steps);
                System.out.println("Данные сохранены");
            } else if  (command == 2) {
                // здесь печатаем статистику
            } else if (command == 3) {
                //меняем цель по количеству шагов
            } else if (command == 4){
                //здесь выход
                System.out.println("Выход");
                break;
            }
        }
        System.out.println("Программа завершена.");


    }

    public static void printMenu() {
        System.out.println("Выберите одну из функций:");
        System.out.println("1 - Ввод количества шагов за определенный день.");
        System.out.println("2 - Печать статистики за определенный месяц.");
        System.out.println("3 - Изменение цели по количеству шагов в день.");
        System.out.println("4 - Выход");
    }
}
