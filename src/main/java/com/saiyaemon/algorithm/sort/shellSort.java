package com.saiyaemon.algorithm.sort;

/**
 * 希尔排序（最小增量排序）
 */
public class shellSort {

    public static void main(String[] args) {
        int[] sorted = {52, 23, 18, 6, 11, 9, 7, 3, 14, 21, 42, 17, 32, 15};
        int d = sorted.length;
        int temp;
        while (true) {
            d = (int) Math.ceil(d / 2);
            System.out.println(d);
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < sorted.length; i += d) {
                    int j = i - d;
                    temp = sorted[i];
                    for (; j >= 0 && temp < sorted[j]; j -= d) {
                        sorted[j + d] = sorted[j];
                    }
                    sorted[j + d] = temp;
                }
            }
            for (int i = 0; i < sorted.length; i++) {
                System.out.print(sorted[i] + " ");
            }
            System.out.println();
            if (d == 1)
                break;
        }
    }
}
