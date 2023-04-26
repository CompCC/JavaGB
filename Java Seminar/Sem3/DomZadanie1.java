import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием.

public class DomZadanie1 {
    public static int[] sortArr(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        int[] arrB = new int[arr.length / 2];
        System.arraycopy(arr, 0, arrB, 0, arr.length / 2);

        int[] arrC = new int[arr.length - arrB.length];
        System.arraycopy(arr, arrB.length, arrC, 0, arr.length - arrB.length);

        sortArr(arrB);
        sortArr(arrC);
        mergeArr(arr, arrB, arrC);
        return arr;

    }

    public static void mergeArr(int[] arr, int[] arrB, int[] arrC) {
        int positionB = 0;
        int positionC = 0;

        for (int i = 0; i < arr.length; i++) {
            if (positionB == arrB.length) {
                arr[i] = arrC[positionC];
                positionC++;
            } else if (positionC == arrC.length) {
                arr[i] = arrB[positionB];
                positionB++;
            } else if (arrB[positionB] < arrC[positionC]) {
                arr[i] = arrB[positionB];
                positionB++;
            } else {
                arr[i] = arrC[positionC];
                positionC++;
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArr = { 5, 12, 7, 32, 8, 1, 6, 33, 2, 9, 3 };
        sortArr(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
}
