package com.saiyaemon.algorithm.sort;

/**
 * 希尔排序（最小增量排序）
 */
public class shellSort {

    public static void main(String[] args) {
        int[] a = {52, 23, 18, 6, 11, 9, 7, 3, 14, 21, 42, 17, 32, 15};
        int d = a.length;
        int temp;
        while (true) {
            d = (int) Math.ceil(d / 2);
            System.out.println(d);
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < a.length; i += d) {
                    int j = i - d;
                    temp = a[i];
                    for (; j >= 0 && temp < a[j]; j -= d) {
                        a[j + d] = a[j];
                    }
                    a[j + d] = temp;
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            if (d == 1)
                break;
        }
    }
}
