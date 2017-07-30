package com.hensen.girlarithmetic.RadixSort;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/2/27.
 */
public class RadixSort {

    /**
     * @param arr  原数组
     * @param temp 临时数组
     * @param n    序列的数字个数
     * @param k    最大的位数3
     * @param r    基数10
     * @param bin  桶中i位置存储的个数
     */
    public void radixSort(int arr[], int temp[], int n, int k, int r, int bin[]) {
        //digit:位数，个位、十位、百位等
        for (int i = 0, digit = 1; i < k; i++, digit = digit * r) {
            //初始化
            for (int j = 0; j < r; j++) {
                bin[j] = 0;
            }
            //计算每个箱子的数字个数
            for (int j = 0; j < n; j++) {
                bin[(arr[j] / digit) % r]++;
            }
            //bin[j]的个数修改为前j个箱子一共有几个数字
            for (int j = 1; j < r; j++) {
                bin[j] = bin[j - 1] + bin[j];
            }
            //取出每个
            for (int j = n - 1; j >= 0; j--) {      //重点理解
                bin[(arr[j] / digit) % r]--;
                temp[bin[(arr[j] / digit) % r]] = arr[j];
            }
            //将临时数组赋值给我们的数组
            for (int j = 0; j < n; j++) {
                arr[j] = temp[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {143, 454, 812, 343, 245, 913, 565, 12, 743, 632};
        RadixSort sort = new RadixSort();
        sort.radixSort(arr, new int[10], arr.length, 3, 10, new int[10]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
