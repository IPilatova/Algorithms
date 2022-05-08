import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

//    написать негативные тесты

    Intersection is;

    @BeforeEach
    void setUp() {
        is = new Intersection();
    }

    @Order(1)
    @Test
    public void testIntersectionHappyPathPositiveNumbers() {
//        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = is.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathPositiveNegativeNumbers() {
//        {1, 2, -4, 5, 8, 9}, {8, 9, -4, -2} → {-4, 8, 9}

        int[] arr1 = {1, 2, -4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};
        int[] expectedResult = {-4, 8, 9};

        int[] actualResult = is.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionNoMatches() {
//        {1, 2, 4, 5, 89}, {8, 9, 45} → {}

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expectedResult = {};

        int[] actualResult = is.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
