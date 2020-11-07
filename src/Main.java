public class Main {
    public static void main(String[] args) {
        BmiService service  = new BmiService();
        double bodyMassIndex = service.calculate(65.5, 183.0);
        System.out.println(bodyMassIndex);
    }
}
