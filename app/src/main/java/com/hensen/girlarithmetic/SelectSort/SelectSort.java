package com.hensen.girlarithmetic.SelectSort;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/2/28.
 */
public class SelectSort {

    public void selectSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2, 4, 9, 6};
        SelectSort sort = new SelectSort();
        sort.selectSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
