import java.util.Arrays;

public class Intersection {

    public int[] intersection (int[] arr1, int[] arr2) {

        if (arr1.length == 0 || arr2.length == 0) {

            return new int[]{};
        }
//        int length = 0;
//        int[] temp = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    temp[length] = arr1[i];
//                    length++;
//                }
//            }
//        }
//        int[] resultArr = new int[length];
//        for (int i = 0; i < length; i++) {
//            resultArr[i] = temp[i];
//        }
        int[] arr1UniqueNumbers = Arrays.stream(arr1).distinct().toArray();
        int[] arr2UniqueNumbers = Arrays.stream(arr2).distinct().toArray();

        int l = 0;

        for (int i = 0; i < arr1UniqueNumbers.length; i++) {
            for (int j = 0; j < arr2UniqueNumbers.length; j++) {
                if (arr1UniqueNumbers[i] == arr2UniqueNumbers[j]) {
                    l++;
                }
            }
        }
        int[] resultArr = new int[l];

        int k = 0;

        for (int i = 0; i < arr1UniqueNumbers.length; i++) {
            for (int j = 0; j < arr2UniqueNumbers.length; j++) {
                if (arr1UniqueNumbers[i] == arr2UniqueNumbers[j]) {
                    resultArr[k] = arr1UniqueNumbers[i];
                    k++;
                }
            }
        }

        return resultArr;
    }
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 4, 5, 89, 2};
//        int[] arr2 = {8, 9, 4, 2, 2};
//
//        System.out.println(Arrays.toString(intersection(arr1, arr2)));
//    }
}
