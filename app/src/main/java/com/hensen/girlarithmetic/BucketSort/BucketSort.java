package com.hensen.girlarithmetic.BucketSort;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2017/2/9.
 */
public class BucketSort {

    public void sort(int[] keys, int bucketNum) {
        int len = keys.length;
        int[] bucket = new int[bucketNum];
        //初始化每个桶
        for (int i = 0; i < bucketNum; i++) {
            bucket[i] = 0;
        }
        //为每个数添加到对应桶
        for (int i = 0; i < len; i++) {
            bucket[keys[i]]++;
        }
        //遍历数组，即为结果
        for (int i = 0; i < bucketNum; i++) {
            for (int j = 1; j <= bucket[i]; j++) {
                System.out.print(i + ",");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6, 9, 10, 9, 13, 14, 15, 11, 12, 17, 16, 19};
        BucketSort sorter = new BucketSort();
        sorter.sort(a, 20);
    }
}
