package com.saiyaemon.algorithm.sort;

/**
 * 归并排序
 *
 * @author SaiyaEmon
 * 2017-08-23 9:25
 **/
public class MargingSort {
    public static void main(String[] args) {
        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 6, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        sort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    //0 1    2 3    0 1 2 3
    //4 5   4 5 6   0 1 2 3 4 5 6
    //7 8   7 8 9
    //10 11     10 11 12    7 8 9 10 11 12
    //0--12


    public static void sort(int[] data, int left, int right) {
        // TODO Auto-generated method stub
        if (left < right) {
            //找出中间索引
            int center = (left + right) / 2;
            //对左边数组进行递归
            sort(data, left, center);
            //对右边数组进行递归
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);

        }
    }

    public static void merge(int[] data, int left, int center, int right) {
        System.out.println("dataLength:"+data.length+" left:"+left+" center:"+center+" right:"+right);
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        //third记录中间数组的索引
        int third = left;
        int tmp = left;
        while (left <= center && mid <= right) {

            //从两个数组中取出最小的放入中间数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        //将中间数组中的内容复制回原数组
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }
}
