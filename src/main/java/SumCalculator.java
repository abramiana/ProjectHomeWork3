public class SumCalculator {

    /**
     * Метод для обчислення суми всіх натуральних чисел від 1 до n.
     * @param n останнє число в діапазоні натуральних чисел.
     * @return сума всіх натуральних чисел від 1 до n.
     * @throws IllegalArgumentException якщо n дорівнює нулю або менше.
     */
    public int sum(int n) {
        // Перевіряємо, чи n більше нуля, інакше викидаємо виключення
        if (n <= 0) {
            throw new IllegalArgumentException("the number must be greater than zero");
        }

        // Використовуємо формулу для суми перших n натуральних чисел: n * (n + 1) / 2
        return (n * (n + 1)) / 2;
    }
}
