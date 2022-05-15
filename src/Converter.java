public class Converter {
    double oneStep = 0.75; //в метрах
    double kilometer = 1000; //в метрах
    double kCallInStep = 0.05; //каллорий в шаге


    public double allDistance(int step) {
        return (step * oneStep) / kilometer;
    }

    public double allCallories(int step) {
        return step * kCallInStep;
    }
}

