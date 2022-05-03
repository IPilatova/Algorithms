public class AreNumbersEqual {

    public int areNumbersEqual (int a, int b) {

        int result;

        if (a > b) {
            result = 1;
        } else if (a < b) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }

}
