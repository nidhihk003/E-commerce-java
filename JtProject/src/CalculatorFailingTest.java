#testfailure

  import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorFailingTest {

    int add(int a, int b) {
        return a + b;
    }

    @Test
    void shouldFailDueToWrongExpectation() {
        int result = add(2, 3);

        // Intentional wrong assertion
        assertEquals(10, result, "Expected sum to be 10 but got a different value");
    }
}
