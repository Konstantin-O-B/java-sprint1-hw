import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int goalNumberSteps = 10000;
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();
        while (true) {
            printMenu();
            int command = scanner.nextInt();
            if (command == 1) {
                System.out.println("Введите номер месяца: ");
                System.out.println("0 - Январь;");
                System.out.println("1 - Февраль;");
                System.out.println("2 - Март;");
                System.out.println("3 - Апрель;");
                System.out.println("4 - Май;");
                System.out.println("5 - Июнь;");
                System.out.println("6 - Июль;");
                System.out.println("7 - Август;");
                System.out.println("8 - Сентябрь;");
                System.out.println("9 - Октябрь;");
                System.out.println("10 - Ноябрь;");
                System.out.println("11 - Декабрь;");
                int month = scanner.nextInt();
                System.out.println("Введите день месяца с 0 по 29:");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов:");
                int steps = scanner.nextInt();
                stepTracker.monthsAndDays(month, day, steps);

            } else if (command == 2) {
                System.out.println("Введите номер месяца, где 0 - Январь ... 11 - Декабрь");
                int month = scanner.nextInt();
                if (month < 0 || month > 11) {
                    System.out.println("Неверное значение. Завершение программы");
                    return;
                }
                printStatMenu();

                int command2 = scanner.nextInt();
                if (command2 == 1) {
                    stepTracker.printStatForMonth(month);

                } else if (command2 == 2) {
                    System.out.println("Общее количество шагов за месяц: " + stepTracker.sumToMonth(month));

                } else if (command2 == 3) {
                    stepTracker.printMaxStepsForMonth(month);
                } else if (command2 == 4) {
                    stepTracker.arrangeStepsForMonth(month);
                } else if (command2 == 5) {
                    System.out.println("Пройденная дистанция в километрах:  " + converter.allDistance(stepTracker.sumToMonth(month)));
                } else if (command2 == 6) {
                    System.out.println("Количество сожженных килокалорий: " + converter.allCallories(stepTracker.sumToMonth(month)));
                } else if (command2 == 7) {
                    stepTracker.bestSeries(month, goalNumberSteps);
                }


            } else if (command == 3) {
                System.out.println("Введите новое значение:");
                goalNumberSteps = scanner.nextInt();
                if (goalNumberSteps < 0) {
                    System.out.println("Количество шагов не может быть отрицательным. Введите корректное количество шагов");
                }

            } else if (command == 4) {
                System.out.println("Выход.");
                break;
            } else {
                System.out.println("Введите верную команду.");
            }

        }
        System.out.println("Программа завершена. До свидания!");
    }

    public static void printMenu() {
        System.out.println("Выберите одну из функций:");
        System.out.println("1 - Ввод количества шагов за определенный день.");
        System.out.println("2 - Печать статистики за определенный месяц.");
        System.out.println("3 - Изменение цели по количеству шагов в день.");
        System.out.println("4 - Выход");
    }

    public static void printStatMenu() {
        System.out.println("Выберите одну из функций:");
        System.out.println("1 - Количество пройденных шагов по дням.");
        System.out.println("2 - Общее количество шагов за месяц.");
        System.out.println("3 - Максимальное пройденное количество шагов в месяце");
        System.out.println("4 - Среднее количество шагов");
        System.out.println("5 - Пройденная дистанция в километрах");
        System.out.println("6 - Количество сожжённых килокалорий");
        System.out.println("7 - Лучшая серия");


    }
}
//    После выбора и исполнения действия, программа должна позволять пользователю ввести следующее действие.
//    Программа должна завершаться только при вводе пользователем команды выхода.
//    При вводе несуществующей команды должно выводиться сообщение о том, что такой команды нет,
//    после чего приложение позволяет снова выбрать следующее действие. Формат сообщений вы выбираете сами.