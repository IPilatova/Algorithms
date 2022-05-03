import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPath() {
        //3333, 9999
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

//    Негативные сценарии
//    Нули 0, 0
//    Ноль в одном параметре 0, -555
//    Отрицательные значения -1000, -1
//    Одинаковые значения 100, 100

    @Test
    public void testBiggerValueZero() {
        //    0, 0
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueZeroOneParameter() {
        //    Ноль в одном параметре 0, -555
        int a = 0;
        int b = -555;
        int expectedResult = 0;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueNegativeNumber() {
        //    Отрицательные значения -1000, -1
        int a = -1000;
        int b = -1;
        int expectedResult = -1;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testBiggerValueEqualsNumber() {
        //    Одинаковые значения 100, 100
        int a = 100;
        int b = 100;
        int expectedResult = 100;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
