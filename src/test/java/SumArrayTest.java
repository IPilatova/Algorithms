import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositiveNumbers() {
//        {0, 1, 2, 3, 4, 5} → 15

        int[] arr = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers() {
//        {-7, -3} → -10

        int[] arr = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayEmptyArr() {
//        {} → 0

        int[] arr = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArraySumAllNumbersEqualsZero() {
//        {5, 60, -5, -60} → 0

        int[] arr = {5, 60, -5, -60};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(arr);

        Assertions.assertEquals(actualResult, expectedResult);
    }

}
