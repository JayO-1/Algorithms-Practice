import java.util.*;

public class SelectionSort {
    public static void main(String arg[]) {
        int[] randArray = {7, 5, 4, 3, 2};
        System.out.println(Arrays.toString(randArray));

        for (int sortedPartitionEnd = 0; sortedPartitionEnd < randArray.length - 1; sortedPartitionEnd++) {
            int currentMinIndex = sortedPartitionEnd;

            for (int j = sortedPartitionEnd + 1; j < randArray.length; j++) {
                int currentItem = randArray[j];
            
                if (currentItem < randArray[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }
            
            swap(randArray, sortedPartitionEnd, currentMinIndex);
        }

        System.out.println(Arrays.toString(randArray));
    }

    public static void swap(int[] array, int i, int j) {
        int tempI = array[i];
        array[i] = array[j];
        array[j] = tempI;
    }
}