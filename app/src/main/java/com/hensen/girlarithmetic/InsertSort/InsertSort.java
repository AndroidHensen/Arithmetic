package com.hensen.girlarithmetic.InsertSort;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/3/2.
 */
public class InsertSort {

    public void insertSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
        InsertSort sort = new InsertSort();
        sort.insertSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
