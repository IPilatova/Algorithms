import java.util.Arrays;

public class Intersection {

    public static int[] intersection (int[] arr1, int[] arr2) {

        int l = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    l++;
                }
            }
        }
        int[] resultArr = new int[l];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    resultArr[k] = arr1[i];
                    k++;
                }
            }
        }

        return resultArr;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};

        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }


}
