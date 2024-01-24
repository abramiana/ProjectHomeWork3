public class SumCalculator {
    public int sum(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("the number must be greater than zero");
        }
        return (n * (n + 1)) / 2;
    }
}