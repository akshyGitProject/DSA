package Practice;

import java.util.*;

public class test {

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>(); // maintains insertion order
        for (int num : array) {
            set.add(num);
        }

        // Convert Set to int[]
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 2, 4, 0, 5, 66, 2, 8};

        int[] uniqueArr = removeDuplicates(arr);
        for (int x : uniqueArr) {
            System.out.print(x + " ");
        }
    }
}
