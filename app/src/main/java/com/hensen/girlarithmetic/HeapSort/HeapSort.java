package com.hensen.girlarithmetic.HeapSort;

/**
 * @author 许英俊 2017/7/6
 */
public class HeapSort {

    public static void MinHeap_Sort(int a[], int n) {
        int temp = 0;
        MakeMinHeap(a, n);

        for (int i = n - 1; i > 0; i--) {
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            MinHeapFixdown(a, 0, i);
        }
    }

    //构建最小堆
    public static void MakeMinHeap(int a[], int n) {
        //从倒数第二层开始排序，取自己的孩子进行排序，这样所有的节点都排序到了
        for (int i = (n - 1) / 2; i >= 0; i--) {
            MinHeapFixdown(a, i, n);
        }
    }

    /**
     * 整理小顶堆，从i节点开始调整，从0开始计算，i节点的子节点为 2*i+1, 2*i+2
     *
     * @param a 所有节点
     * @param i 第i个节点
     * @param n 节点总数
     */
    public static void MinHeapFixdown(int a[], int i, int n) {

        int j = 2 * i + 1; //左节点
        int temp = 0;

        //j<n：如果左节点小于节点总数，表示该节点有节点，否则该节点是叶子节点是不需要调整的
        while (j < n) {
            //j+1<n：存在右节点，a[j+1]<a[j]：左右子节点中寻找最小的
            if (j + 1 < n && a[j + 1] < a[j]) {
                //将节点移到右节点
                j++;
            }

            //较大节点在下面
            if (a[i] <= a[j])
                break;

            //较大节点在上面，则将大节点下移
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            //复位
            i = j;
            j = 2 * i + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 2, 9, 5, 0, 7, 6};
        MinHeap_Sort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
