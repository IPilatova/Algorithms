public class SumArray {

    public int sumArray (int[] arr) {
        int result = 0;

        if (arr.length == 0) {

            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}
