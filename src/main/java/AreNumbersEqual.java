public class AreNumbersEqual {

    public byte areNumbersEqual (int a, int b) {

        byte result;
        //byte result = (byte) Integer.compare(a, b);

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
