import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        //555

        int number = 555;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertTrue(actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZero() {
        //0

        int number = 0;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertTrue(actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        //0

        int number = -555;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertFalse(actualResult);
    }





}
