package com.hensen.girlarithmetic.MergeSort;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/2/27.
 */
public class MergeSort {

    /**
     * 归并排序
     *
     * @param a
     * @param first
     * @param last
     * @param temp
     */
    public void merge_sort(int a[], int first, int last, int temp[]) {
        if (first < last) {
            int middle = (first + last) / 2;
            merge_sort(a, first, middle, temp);//左半部分排好序
            merge_sort(a, middle + 1, last, temp);//右半部分排好序
            mergeArray(a, first, middle, last, temp); //合并左右部分
        }
    }

    /**
     * 合并数组
     *
     * @param a
     * @param first
     * @param middle
     * @param end
     * @param temp
     */
    public void mergeArray(int a[], int first, int middle, int end, int temp[]) {
        int i = first;
        int m = middle;
        int j = middle + 1;
        int n = end;
        int k = 0;
        while (i <= m && j <= n) {
            //比较两个组的数
            if (a[i] <= a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        //左边一组中，当左边分组被取完时，该把右边分组全部取出来
        while (i <= m) {
            temp[k] = a[i];
            k++;
            i++;
        }

        //右边一组中，当左边分组被取完时，该把右边分组全部取出来
        while (j <= n) {
            temp[k] = a[j];
            k++;
            j++;
        }

        //在temp中取出所有排序好的数
        for (int ii = 0; ii < k; ii++) {
            a[first + ii] = temp[ii];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
        MergeSort sort = new MergeSort();
        sort.merge_sort(arr, 0, arr.length - 1, new int[10]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
