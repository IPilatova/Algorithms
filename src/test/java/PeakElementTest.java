import org.junit.jupiter.api.*;

public class PeakElementTest {

//    написать негативные тесты

    @Order(1)
    @Test
    public void testPeakElementHappyPath() {
//        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

        int[] arr = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElement(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
