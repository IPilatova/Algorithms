import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathNumbersEquals() {
        //89, 89
        int a = 89;
        int b = 89;
        byte expectedResult = 0;

        AreNumbersEqual ane = new AreNumbersEqual();
        byte actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathPositiveNegativeNumbers() {
        //89, -89
        int a = 89;
        int b = -89;
        byte expectedResult = 1;

        AreNumbersEqual ane = new AreNumbersEqual();
        byte actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathNegativePositiveNumbers() {
        //-89, 89
        int a = -89;
        int b = 89;
        byte expectedResult = -1;

        AreNumbersEqual ane = new AreNumbersEqual();
        byte actualResult = ane.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
