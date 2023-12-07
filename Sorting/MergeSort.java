import java.util.*;

public class MergeSort {
    public static void main(String args[]) {
        int[] randArray = {5, 7, 2, 3, 1, 9, 13};
        System.out.println(Arrays.toString(randArray));
        mergesort(randArray);
        System.out.println(Arrays.toString(randArray));
    }

    public static void mergesort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int mdpt = array.length / 2;
        int[] leftArray = new int[mdpt];
        int[] rightArray = new int[array.length - mdpt];

        int leftPointer = 0, rightPointer = mdpt;
        
        while (leftPointer < mdpt) {
            leftArray[leftPointer] = array[leftPointer];
            leftPointer++;
        }

        while (rightPointer < array.length) {
            rightArray[rightPointer - mdpt] = array[rightPointer];
            rightPointer++;
        }

        mergesort(leftArray);
        mergesort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int arrayPointer = 0, leftPointer = 0, rightPointer = 0;

        while (leftPointer < leftArray.length && rightPointer < rightArray.length) {
            if (leftArray[leftPointer] <= rightArray[rightPointer]) {
                array[arrayPointer] = leftArray[leftPointer];
                leftPointer++;
            }
            else {
                array[arrayPointer] = rightArray[rightPointer];
                rightPointer++;
            }
            arrayPointer++;
        }

        while (leftPointer < leftArray.length) {
            array[arrayPointer] = leftArray[leftPointer];
            leftPointer++;
            arrayPointer++;
        }

        while (rightPointer < rightArray.length) {
            array[arrayPointer] = rightArray[rightPointer];
            rightPointer++;
            arrayPointer++;
        }
    }
}