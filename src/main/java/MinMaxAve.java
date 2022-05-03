import java.util.Arrays;

public class MinMaxAve {

    public static int[] minMaxAve (int[] arr, int index1, int index2) {

        int min = arr[0];
        int max = arr[0];
        int avg = (arr[index1] + arr[index2]) / 2;
        int[] resultArr = new int[3];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        resultArr[0] = min;
        resultArr[1] = max;
        resultArr[2] = avg;

        return resultArr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, -70, 8};

        System.out.println(Arrays.toString(minMaxAve(arr, 2,6)));

    }


}
