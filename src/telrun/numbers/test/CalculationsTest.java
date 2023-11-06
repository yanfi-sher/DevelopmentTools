package telrun.numbers.test;
import org.junit.jupiter.api.*;
import telrun.numbers.Calculations;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    double op1 = 10.5;
    double op2 = 0.5;
    double op1Negative = -10.5;
    double op2Negative = -0.5;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("After all tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Before each test");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("After each test");
    }

    @Test
    @DisplayName("Sum of two numbers")
    void testSum() {
        double expected = 11;
        assertEquals(expected, Calculations.sum(op1,op2));
        expected = 10;
        assertEquals(expected,Calculations.sum(op1,op2Negative));
        expected = -11;
        assertEquals(expected,Calculations.sum(op1Negative,op2Negative));
    }

    @Test
    @DisplayName("Subtract of two numbers")
    void subtract() {
        assertEquals(10,Calculations.subtract(op1,op2),0.1);
        assertEquals(11,Calculations.subtract(op1,op2Negative));
        assertEquals(-10,Calculations.subtract(op1Negative,op2Negative));
    }

    @Test
    @DisplayName("Division of two numbers")
    void division() {
        assertEquals(21,Calculations.division(op1,op2));
        assertEquals(-21,Calculations.division(op1,op2Negative));
        assertEquals(21,Calculations.division(op1Negative,op2Negative));
        assertEquals(Double.POSITIVE_INFINITY, Calculations.division(op1,0));
        assertEquals(Double.NEGATIVE_INFINITY, Calculations.division(op1Negative,0));
    }

    @Test
    @DisplayName("Multiply of two numbers")
    void multiply() {
        assertEquals(5.25,Calculations.multiply(op1,op2));
        assertEquals(-5.25,Calculations.multiply(op1,op2Negative));
        assertEquals(5.25,Calculations.multiply(op1Negative,op2Negative));
    }


}