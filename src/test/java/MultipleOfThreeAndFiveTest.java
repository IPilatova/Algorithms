import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MultipleOfThreeAndFiveTest {

    MultipleOfThreeAndFive motaf;

    @BeforeEach
    void setUp() {
        motaf = new MultipleOfThreeAndFive();
    }

    //15 | 5 | 3 | 0 | 1 | -15 | -5 | -3

    @Order(1)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathBothThreeAndFive() {
        //15
        int m = 15;
        String expectedResult = "Good Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathOnlyFive() {
        //5
        int m = 5;
        String expectedResult = "Poor Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathOnlyThree() {
        //3
        int m = 3;
        String expectedResult = "Bad Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testMultipleOfThreeAndFiveHappyPathNotThreeAndFive() {
        //1
        int m = 1;
        String expectedResult = "-1";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveZero() {
        //0
        int m = 0;
        String expectedResult = "Good Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveNegativeBothThreeAndFive() {
        //-15
        int m = -15;
        String expectedResult = "Good Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveNegativeOnlyFive() {
        //-5
        int m = -5;
        String expectedResult = "Poor Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultipleOfThreeAndFiveNegativeOnlyThree() {
        //-3
        int m = -3;
        String expectedResult = "Bad Number";

        String actualResult = motaf.multipleOfThreeAndFive(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
