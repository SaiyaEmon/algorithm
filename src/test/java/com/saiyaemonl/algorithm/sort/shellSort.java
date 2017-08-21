package com.saiyaemonl.algorithm.sort;

/**
 * 标准希尔排序
 **/
public class shellSort {

    public static void main(String[] args) {
        int a[] = {1, 54, 6, 3, 78, 34, 12, 45, 56, 100};
        int d = a.length;
        int temp;
        while (true) {
            d = (int) Math.ceil(d / 2);
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
            if (d == 1)
                break;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
