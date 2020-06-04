package com.study.dailylearning.algorithm.sortalgorithm;

/**
 * @description: 基本思想：相邻两个数比较大小
 * @create: 2019-12-18
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArr = {8,9,1,7,2,5,4,6,0};
        bubbleSortMyself(intArr);
    }


    //自己写的
    public static void bubbleSortMyself(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
                ArrPrintUtil.print(array);
            }
        }
    }

    //标准答案
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }

}

