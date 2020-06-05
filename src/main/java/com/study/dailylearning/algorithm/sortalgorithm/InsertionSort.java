package com.study.dailylearning.algorithm.sortalgorithm;

/**
 *
 * @description: 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
 * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * @create: 2019-12-23
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,5,4,6,0,3};
        insertionSortMyself(array);
        ArrPrintUtil.print(array);
    }


    public static void insertionSortMyself(int[] arrData) {
        for (int i = 0; i < arrData.length; i++) {
            int curIndex = i;
            int currentVal = arrData[curIndex];
            while (curIndex > 0 && currentVal < arrData[curIndex - 1]) {
                int tmp = arrData[curIndex - 1];
                arrData[curIndex - 1] = currentVal;
                arrData[curIndex ] = tmp;
                curIndex--;
            }
            ArrPrintUtil.print(arrData);
        }
    }

    //标准答案
    // 8,9,1,7,2,5,4,6,0
    public static int[] insertionSortAnswer(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
            ArrPrintUtil.print(array);
        }
        return array;
    }
}

