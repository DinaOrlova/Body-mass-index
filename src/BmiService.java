public class BmiService {
    public double calculate(double weight, double height) {
        double height2 = height * height / 100 / 100;
        double bodyMassIndex = weight / height2;
        return bodyMassIndex;
    }
}

