package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    private final Calc calc = new Calc();

    @Test
    void testSumZeroNumber() {
        int actual = calc.sum("");
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void testSumMoreNumber_1() {
        int actual = calc.sum("1,2,3,4");
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    void testSumMoreNumber_2() {
        int actual = calc.sum("1\n2,3");
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    void testSumMoreNumber_3() {
        int actual = calc.sum("1\n2");
        int expected = 3;
        assertEquals(actual, expected);
    }


    @Test
    void testErrorExpressionNumber_1() {
        int actual = calc.sum("two");
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_2() {
        int actual = calc.sum("1,2,");
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_3() {
        int actual = calc.sum("1,2,b");
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_4() {
        int actual = calc.sum("1.2");
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_5() {
        int actual = calc.sum(null);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_6() {
        int actual = calc.sum("1\n");
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testErrorExpressionNumber_8() {
        int actual = calc.sum("1\n,");
        int expected = -1;
        assertEquals(actual, expected);
    }
}
