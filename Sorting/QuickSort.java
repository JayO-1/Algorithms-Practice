import java.util.*;

public class QuickSort {
    public static void main(String args[]) {
        int[] randArray = {5, 7, 2, 3, 1, 9, 13};
        System.out.println(Arrays.toString(randArray));
        quicksort(randArray);
        System.out.println(Arrays.toString(randArray));
    }

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static void quicksort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }

        int pivotIndex = partition(array, left, right);
        quicksort(array, left, pivotIndex - 1);
        quicksort(array, pivotIndex + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int pivotIndex = right;
        int pivot = array[pivotIndex];

        while (left < right) {
            while (array[left] <= pivot && left < right) {
                left++;
            }

            while (array[right] >= pivot && left < right) {
                right--;
            }

            swap(array, left, right);
        }

        swap(array, pivotIndex, left);
        return left;
    }

    private static void swap(int[] array, int i, int j) {
        int tempI = array[i];
        array[i] = array[j];
        array[j] = tempI;
    }
}