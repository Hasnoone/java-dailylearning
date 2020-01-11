package com.study.dailylearning.algorithm.sortalgorithm;

/**
 * @program: dailylearning
 * @description:
 * @author: XuHang
 * @create: 2019-12-25
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] intArr = {15,24,78,95,13,17,33,22,45};
        quickSort(intArr, 0, intArr.length - 1);
        //print the  int type of array
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }


    public static void quickSort(int[] intArray, int top, int tail) {
        //find a pivort
        int left = top;
        int right = tail;

//        int pivot = left + (left - right) / 2;
        int pivotValue = intArray[left + (right - left) / 2];


        while (left <= right) {
            while (intArray[left] < pivotValue) {
                left++;
            }
            while (intArray[right] > pivotValue) {
                right--;
            }

            if (left <= right) {
                swap(intArray, left, right);

                if (left < top) {
                    quickSort(intArray,top,left);
                }
                if (right < tail) {
                    quickSort(intArray,right,tail);
                }
            }
        }
    }


    public static void swap(int[] intArray, int left, int right) {
        int temp = intArray[left];
        intArray[left] = intArray[right];
        intArray[right] = temp;
    }

}

