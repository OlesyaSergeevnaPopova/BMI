public class BmiService {
    public double calculate(int massa, int height) {
        double heightMetr = Math.pow(height, 2) / 10000;// переводим сантиметры в метры

        double index = massa / heightMetr;
        return index;
    }
}
