public class PeakElement {

    public int[] peakElement (int[] arr) {

//        определим длину массива
        int l = 0;

        if (arr[0] > arr[1]) {
            l++;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                l++;
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            l++;
        }

        int[] resultArr = new int[l];

//        заполним массив
        int k = 0;

        if (arr[0] > arr[1]) {
            resultArr[k] = arr[0];
            k++;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                resultArr[k] = arr[i];
                k++;
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            resultArr[k] = arr[arr.length - 1];
        }

        return resultArr;
    }

//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 7, 7, 1, 7, 7, 7};
//        System.out.println(Arrays.toString(peakElement(arr)));
//    }
}
