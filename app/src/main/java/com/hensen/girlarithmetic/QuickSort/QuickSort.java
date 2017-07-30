package com.hensen.girlarithmetic.QuickSort;

/**
 * @author 许英俊 2017/7/7
 */
public class QuickSort {

    public static void quicksort(int a[], int left, int right) {
        int i, j, t, temp;

        if (left > right)
            return;

        temp = a[left]; //存基准数
        i = left;
        j = right;

        while (i != j) {
            //先从右边开始找
            while (a[j] >= temp && i < j)
                j--;
            //再从左边开始找
            while (a[i] <= temp && i < j)
                i++;
            //交换两个数在数组中的位置
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        //基准数归位
        a[left] = a[i];
        a[i] = temp;

        quicksort(a, left, i - 1);//继续处理左边的
        quicksort(a, i + 1, right);//继续处理右边的
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
        quicksort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
