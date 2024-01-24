import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumWithPositiveInteger() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumWithPositiveIntegerGreaterThanOne() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
        //Exception
    void testSumWithZero() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}