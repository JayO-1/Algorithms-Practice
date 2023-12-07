import java.util.*;
import java.lang.Integer;

public class BubbleSort {
    public static void main(String args[]) {
        int[] randArray = {7, 5, 4, 3, 2};
        System.out.println(Arrays.toString(randArray));

        int unsortedLength = randArray.length;
        boolean changedThisPass;

        do {
            changedThisPass = false;
            for (int i = 0; i < unsortedLength - 1; i++) {
                if (randArray[i] > randArray[i + 1]) {
                    swap(randArray, i, i + 1);
                    changedThisPass = true;
                }
            }
            unsortedLength--;
        }
        while (changedThisPass);

        System.out.println(Arrays.toString(randArray));
    }

    public static void swap(int[] array, int i, int j) {
        int tempI = array[i];
        array[i] = array[j];
        array[j] = tempI;
    }
}
