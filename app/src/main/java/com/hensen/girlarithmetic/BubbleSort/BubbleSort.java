package com.hensen.girlarithmetic.BubbleSort;

import android.text.BoringLayout;

import com.hensen.girlarithmetic.MainActivity;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/2/27.
 */
public class BubbleSort {

    public void bubbleSort(int[] arr,int n){
        boolean flag;
        for (int i = 1; i < n; i++) {
            flag = false;
            for (int j = 0; j < n-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag =true;
                }
            }
            if(!flag)break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
