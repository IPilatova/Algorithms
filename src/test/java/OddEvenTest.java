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
    public void testOddEvenHappyUpperLimitInteger() {

        //2147483647

        long number = 2147483647;
        String expectedResult = "Odd";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyLowerLimitInteger() {

//        -2147483648

        long number = -2147483648;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenMoreInt() {

        //2147483647 + 1

        long number = 2147483647L + 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenLessInt() {

        //2147483647 + 1

        long number = -2147483648L - 1;
        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEven(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
