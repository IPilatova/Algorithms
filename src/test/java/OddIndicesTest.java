import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesHappyPathArray() {

        //{590, 985, 68}

        int[] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
        }

    @Test
    public void testOddIndicesEmptyArray() {

        //пустой массив {}

        int[] arr = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesOneElementArray() {

        //массив из 1 {}

        int[] arr = {55};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesThreeElementArray() {

        //массив из 3 элементов (проверить, что расчет длины массивы верный)

        int[] arr = {1, 2147483647, -789};
        int[] expectedResult = {2147483647};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesAllZeroArray() {

        //все нули {0, 0, 0}

        int[] arr = {0, 0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndices(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
