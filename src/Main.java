public class Main {

    public static void main(String[] args) {
        BmiService BmiService = new BmiService();

        double growth = 180.;
        double weight = 49.;

        double iMT = BmiService.BmiService(weight, growth);
        double d = Math.round(iMT * 100.0) / 100.0;
        System.out.println("Индекс массы тела = " + d);

    }
}
