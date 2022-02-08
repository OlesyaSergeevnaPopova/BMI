public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massa = 75;
        int height = 188;
        int index = (int) service.calculate(massa, height);
        System.out.println(index);
    }
}
