import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathOddNumber() {
        //-345
        long number = -345;
        String expectedResult = "Odd";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathZero() {
        //0
        long number = 0;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEvenNumber() {
        //222222
        long number = 222222;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathNotInteger() {
        //2147483647 + 1
        long number = 2147483647L + 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
