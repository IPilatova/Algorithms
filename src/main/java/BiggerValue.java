public class BiggerValue {

    public int biggerValue (int a, int b) {

        int result;
        //int result = Math.max(a, b);

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }
}
