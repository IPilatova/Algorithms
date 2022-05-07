import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    MinMaxAve mma;

    @BeforeEach
    void setUp() {
        mma = new MinMaxAve();
    }

    @Order(1)
    @Test
    public void testMinMaxAveHappyPathPositiveNumbers() {
//      массив с положительными числами
//      ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testMinMaxAveHappyPathNegativeNumbers() {
//         массив с положительными числами
//        ({-10, -2, -3, -4, -50, -6, -7, -8}, 2, 6) →  {-50, -3, -14}
        int[] arr = {-10, -2, -3, -4, -50, -6, -7, -8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {-50, -3, -14};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArray() {
//         пустой массив
//        ({}, 2, 6) →  {}
        int[] arr = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexIsZero() {
//         индексы 0
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 0, 0) →  {1, 1, 1}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 0;
        int index2 = 0;
        int[] expectedResult = {1, 1, 1};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOneEqualsIndexTwo() {
//         индекс1 = индекс2
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 6, 6) →  {7, 7, 7}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 6;
        int[] expectedResult = {7, 7, 7};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOneMoreIndexTwo() {
//         индекс2 больше индекса1
//      ({1, 2, 3, 4, 5, 6, 7, 8}, 6, 2) →  {3, 7, 5}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOneIsNegative() {
//         индекс1 отрицательный
//      ({1, 2, 3, 4, 5, 6, 7, 8}, -2, 6) →  {}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 6;
        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexTwoIsNegative() {
//         индекс2 отрицательный
//      ({1, 2, 3, 4, 5, 6, 7, 8}, 2, -6) →  {}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = -6;
        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveLengthArrayLessIndexOne() {
//         длина массива меньше индекса1
//      ({1, 2, 3, 4, 5, 6, 7, 8}, 9, 10) →  {}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 9;
        int index2 = 10;
        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveLengthArrayLessIndexTwo() {
//         длина массива меньше индекса2
//      ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 9) →  {}
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 9;
        int[] expectedResult = {};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveAvgIsZero() {
//      cреднее равно 0
//      ({1, 2, -3, -1, 5, -5, 4, 8}, 2, 6) →  {3, 7, 5}
        int[] arr = {1, 2, -3, -1, 5, -5, 4, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {-5, 5, 0};

        int[] actualResult = mma.minMaxAve(arr, index1, index2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
