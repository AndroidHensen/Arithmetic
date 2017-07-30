package com.hensen.girlarithmetic.ShellSort;

/**
 * @author 许英俊 2017/7/6
 */
public class ShellSort {

    public void shellSort(int arr[],int length){
        int temp = 0;
        int incre = length;

        while(true){
            incre = incre /2;
            //对分组进行遍历
            for (int i=0;i<incre;i++){
                //插入排序
                for (int j=i+incre;j<length;j+=incre){
                    for (int k=j;k>i;k-=incre){
                        if(arr[k]<arr[k-incre]){
                            temp = arr[k];
                            arr[k] = arr[k-incre];
                            arr[k-incre] = temp;
                        }else{
                            break;
                        }
                    }
                }
            }
            //无法分组，表示排序结束
            if(incre == 1){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 2, 4, 9, 6, 8, 10};
        ShellSort sort = new ShellSort();
        sort.shellSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
