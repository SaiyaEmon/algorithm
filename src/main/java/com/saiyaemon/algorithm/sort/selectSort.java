package com.saiyaemon.algorithm.sort;

/**
 * 选择排序
 */
public class selectSort {

    public static void main(String args[]) {
        int[] sorted = {4, 5, 2, 8, 6, 1, 9, 7, 3, 14, 21, 42, 17, 32, 15};
        for (int i = 0; i < sorted.length; i++) {
            int min = i;
            int temp = sorted[i];
            for (int j = i + 1; j < sorted.length; j++) {
               if(sorted[min] > sorted[j]){
                  min = j;
               }
            }
            sorted[i] = sorted[min];
            sorted[min] = temp;
            for (int z = 0;z<sorted.length;z++){
                System.out.print(sorted[z] + " ");
            }
            System.out.println();
        }
    }

}
