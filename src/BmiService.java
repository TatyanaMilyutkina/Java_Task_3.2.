public class BmiService {
    public double BmiService(double weight, double growth) {

        double growthH2 = (growth / 100) * (growth / 100);
        double iMT = weight / growthH2;
        return iMT;
    }
}
