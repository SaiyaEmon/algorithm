package com.saiyaemon.algorithm.sort;

/**
 * 冒泡排序
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] sorted = {44, 52, 23, 18, 6, 11, 9, 7, 3, 14, 21, 42, 17, 32, 15};
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1 - i; j++) {
                int temp;
                if (sorted[j] > sorted[j + 1]) {
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
            for (int z = 0; z < sorted.length; z++) {
                System.out.print(sorted[z] + " ");
            }
            System.out.println();
        }
    }
}
