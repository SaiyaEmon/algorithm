package com.saiyaemon.algorithm.sort;

/**
 * 直接插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] sorted = {4, 5, 2, 8, 7, 6, 1, 9, 3, 14, 21, 42, 17, 32, 15};
        for (int i = 1; i < sorted.length; i++) {
            int temp = sorted[i];
            int j = i-1;
            for (; j >=0 && sorted[j]>temp; j--) {
                sorted[j+1]  = sorted[j];
            }
            sorted[j+1] = temp;

            for (int z = 0;z<sorted.length;z++){
                System.out.print(sorted[z] + " ");
            }
            System.out.println();
        }
    }
}
