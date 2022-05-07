import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    IsPositiveNumber ipn;

    @BeforeEach
    void setUp() {
        ipn = new IsPositiveNumber();
    }

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositiveNumber() {
        //555

        int number = 555;

        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertTrue(actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZero() {
        //0

        int number = 0;

        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertTrue(actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegativeNumber() {
        //-555

        int number = -555;

        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertFalse(actualResult);
    }

    @Test
    public void testIsPositiveMaxNumber() {
        //MAX_VALUE

        int number = Integer.MAX_VALUE;

        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testIsPositiveMinNumber() {
        //MAX_VALUE

        int number = Integer.MIN_VALUE;

        boolean actualResult = ipn.isPositiveNumber(number);

        Assertions.assertFalse(actualResult);
    }
}
