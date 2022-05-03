public class OddIndices {

    public int[] oddIndices (int[] arr) {

        int oddNum = 0;
        int[] resultArr = new int[arr.length / 2];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                resultArr[oddNum] = arr[i];
                oddNum++;
            }
        }

        return resultArr;
    }
}
