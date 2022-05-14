public class StepTracker {
    int steps = 0;
    int goalNumberSteps = 10000;
   MonthData[] monthToData;



    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    class MonthData {
        int[] days = new int[30];
    for (int j = 0; j < days.length; j++) {
            days[j] = steps;

    }

   int saveSteps(int month, int day, int steps) {

   }
}

