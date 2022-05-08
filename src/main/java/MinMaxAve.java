public class MinMaxAve {

    public int[] minMaxAve (int[] arr, int index1, int index2) {

        if (arr.length == 0
                || arr.length < index1 || arr.length < index2
                || index1 < 0 || index2 < 0) {

           return new int[]{};
        }

        int[] resultArr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};

        if (index1 < index2) {
            for (int i = index1; i <= index2; i++) {
                if (arr[i] < resultArr[0]) {
                    resultArr[0] = arr[i];
                }
                if (arr[i] > resultArr[1]) {
                    resultArr[1] = arr[i];
                }
                resultArr[2] += arr[i];
            }
        } else {
            for (int i = index2; i <= index1; i++) {
                if (arr[i] < resultArr[0]) {
                    resultArr[0] = arr[i];
                }
                if (arr[i] > resultArr[1]) {
                    resultArr[1] = arr[i];
                }
                resultArr[2] += arr[i];
            }
        }
        resultArr[2] = resultArr[2] / (Math.abs(index2 - index1) + 1);

        return resultArr;
    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(Arrays.toString(minMaxAve(arr, 2,6)));
//    }
}
