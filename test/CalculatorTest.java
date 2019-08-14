import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void createObject() {
        calculator = new Calculator();
    }

    @Test
    void getResultAddition() throws Exception {
        assertEquals(5, calculator.getResult(2, '+', 3));
    }

    @Test
    void getResultSubstraction() throws Exception {
        assertEquals(-1, calculator.getResult(2, '-', 3));
    }

    @Test
    void getResultMultiplication() throws Exception {
        assertEquals(6, calculator.getResult(2, '*', 3));
    }

    @Test
    void getResultDivision() throws Exception {
        assertEquals(4, calculator.getResult(8, '/', 2));
    }

    @Test
    void getResultDivisionByZero() throws Exception {
        assertThrows(Exception.class, ()->{calculator.getResult(8, '/', 0);});
    }

    @Test
    void getResultUnknownOperaion() throws Exception {
        assertThrows(Exception.class, ()->{calculator.getResult(8, '?', 3);});
    }

    @AfterEach
    void destroyObject() {
        calculator = null;
    }

}