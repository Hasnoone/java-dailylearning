package com.study.dailylearning.sortalgorithm;

/**
 * @program: dailylearning
 * @description: 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
 * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * @author: XuHang
 * @create: 2019-12-23
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] intArr = {15,24,78,95,13,17,33,22,45};
        insertionSort(intArr);
        //print the  int type of array
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }


    public static void insertionSort(int[] intArray) {

        for (int i = 0; i < intArray.length-1; i++) {
            int prefixIndex = i;
            int currentValue = intArray[i+1];

            while (prefixIndex >= 0 && intArray[prefixIndex] > currentValue) {
                intArray[prefixIndex+1] = intArray[prefixIndex];
                prefixIndex--;
            }
            intArray[prefixIndex + 1] = currentValue;
        }

    }
}

