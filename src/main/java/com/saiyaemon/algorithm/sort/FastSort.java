package com.saiyaemon.algorithm.sort;

/**
 * 快速排序
 *
 * @author SaiyaEmon
 * 2017-08-21 14:37
 **/
public class FastSort {
    public static void main(String[] args) {
        int[] sorted = {32, 23, 18, 6, 41, 29, 27, 3, 14, 21, 42, 17, 22, 15};
        recurrenceSort(sorted, 0, sorted.length-1);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    private static void recurrenceSort(int[] sorted, int low, int high) {
        if (low < high) {
            int middle = getMiddle(sorted, low, high);
            recurrenceSort(sorted, low, middle - 1);
            recurrenceSort(sorted, middle + 1, high);
        }
    }

    private static int getMiddle(int[] sorted, int low, int high) {
        int temp;
        int middle = low;
        while (low < high) {
            if (sorted[low] > sorted[high]) {
                temp = sorted[low];
                sorted[low] = sorted[high];
                sorted[high] = temp;
                if (middle == low) {
                    middle = high;
                } else if (middle == high) {
                    middle = low;
                }
            }
            if (middle == high)
                low++;
            if (middle == low)
                high--;
            for (int i = 0; i < sorted.length; i++) {
                System.out.print(sorted[i] + " ");
            }
            System.out.println();
        }
        System.out.println("low:" + low + " high:" + high + " middle:" + middle);
        return middle;
    }
}
