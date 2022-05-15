public class StepTracker {
    int[][] monthsAndDays = new int[12][30];

    public int sumToMonth(int month) {
        int sumStep = 0;
        for (int day = 0; day < 30; day++) {
            sumStep = sumStep + monthsAndDays[month][day];
        }
        return sumStep;
    }

    public void MonthsAndDays(int month, int day, int steps) {
        if (month > 11 || day > 29) {
            System.out.println("Значение некорректно");
            return;

        }
        monthsAndDays[month][day] = steps;
    }

    public void printStatForMonth(int month) {

        for (int day = 0; day < 30; day++) {
            if (day < 29) {
                System.out.println(day + " день: " + monthsAndDays[month][day] + ",");
            } else {
                System.out.println(day + " день: " + monthsAndDays[month][day] + ".");
            }
        }
    }

    public void printMaxStepsForMonth(int month) {
        int maxStep = 0;
        for (int day = 0; day < 30; day++) {
            if (maxStep < monthsAndDays[month][day]) {
                maxStep = monthsAndDays[month][day];
            }
        }
        System.out.println("Максимальное количество шагов за месяц: " + maxStep);
    }

    public void arrangeStepsForMonth(int month) {
        System.out.println("Среднее количество шагов за месяц: " + sumToMonth(month) / 30);
    }

    public void bestSeries(int month, int goalNumberSteps) {
        int[] sDays = new int[30];
        int series = 0;

        for (int day = 0; day < 30; day++) {
            if (monthsAndDays[month][day] >= goalNumberSteps) {
                sDays[series] = sDays[series] + 1;
            } else {
                series = series + 1;
            }

        }
        int maxSeries = 0;
        for (int i = 0; i < sDays.length; i++) {
            if (maxSeries < sDays[i]) {
                maxSeries = sDays[i];
            }
        }
        System.out.println("Лучшая серия: " + maxSeries + " дней.");
    }
}




//    Подсчёт и вывод статистики за указанный пользователем месяц. В статистике должны быть следующие данные:
//        Количество пройденных шагов по дням в следующем формате:
//        1 день: 3000, 2 день: 2000, ..., 30 день: 10000
//        Общее количество шагов за месяц;
//        Максимальное пройденное количество шагов в месяце;
//        Среднее количество шагов;
//        Пройденная дистанция (в км);
//        Количество сожжённых килокалорий;
//        Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
