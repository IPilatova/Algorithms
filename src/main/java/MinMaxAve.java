public class MinMaxAve {

    public int[] minMaxAve (int[] arr, int index1, int index2) {

        int[] emptyArr = new int[0];

        if (arr == null
                || arr.length < index1 || arr.length < index2
                || index1 < 0 || index2 < 0) {

           return emptyArr;
        }

        int min;
        int max;
        int avg;
        int[] resultArr = new int[3];

        if (index1 < index2) {
            min = arr[index1];
            max = arr[index1];
            avg = arr[index1];
            for (int i = index1 + 1; i < index2 + 1; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                avg += arr[i];
            }
        } else {
            min = arr[index2];
            max = arr[index2];
            avg = arr[index2];
            for (int i = index2 + 1; i < index1 + 1; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                avg += arr[i];
            }
        }

        avg = avg / (Math.abs(index2 - index1) + 1);

        resultArr[0] = min;
        resultArr[1] = max;
        resultArr[2] = avg;

        return resultArr;
    }

//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println(Arrays.toString(minMaxAve(arr, 2,6)));
//    }
}
