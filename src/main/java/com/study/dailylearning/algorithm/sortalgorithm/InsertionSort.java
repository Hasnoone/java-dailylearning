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
        int[] intArr = {8,9,1,7,2,5,4,6,0};
        insertionSortAnswer(intArr);
    }


    public static void insertionSortMyself(int[] arrData) {
        for (int i = 0; i < arrData.length; i++) {
            int curIndex = i;
            int nextIndexVal = arrData[curIndex + 1];
            while (curIndex>=0 && arrData[curIndex] > nextIndexVal) {
                arrData[curIndex] = nextIndexVal;
                curIndex--;
            }
        }
    }

    //标准答案
    // 8,9,1,7,2,5,4,6,0
    public static void insertionSortAnswer(int[] intArray) {
        for (int i = 0; i < intArray.length-1; i++) {
            int currentIndex = i;
            int nextIndexValue = intArray[currentIndex+1];
            while (currentIndex >= 0 && intArray[currentIndex] > nextIndexValue) {
                intArray[currentIndex+1] = intArray[currentIndex];
                currentIndex--;
                ArrPrintUtil.print(intArray);
            }
            intArray[currentIndex+1]=nextIndexValue;
            ArrPrintUtil.print(intArray);
        }
    }
}

