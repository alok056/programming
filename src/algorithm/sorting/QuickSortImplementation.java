package algorithm.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSortImplementation {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 56, 9, 23, 11, 0, 5, 3, 67, 23, 46, 80, 56, 78, 3, 6, 7, 56};
        QuickSortImplementation qs = new QuickSortImplementation();
        qs.quickSort(arr);
        System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
    }

    private void quickSort(int[] arr) {
        quickSortUtil(arr, 0, arr.length - 1);
    }

    private void quickSortUtil(int[] arr, int low, int hi) {
        if (low < hi) {
            int pivot = partition(arr, low, hi);
            quickSortUtil(arr, low, pivot - 1);
            quickSortUtil(arr, pivot + 1, hi);
        }
    }

    private int partition(int[] arr, int low, int hi) {
        int pivot = arr[hi];
        int i = low - 1;
        for (int j = low; j <= hi; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, hi);

        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
