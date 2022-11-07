public class BmiService {
    public int calculate(int weight) {
        int growth = 170;

        int bodyMassIndex = growth / weight;
        return bodyMassIndex;
    }
}
