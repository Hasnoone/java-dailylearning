package com.study.dailylearning.algorithm.sortalgorithm;

/**
 * @program: dailylearning
 * @description:
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * @author: XuHang
 * @create: 2019-12-21
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] intArr = {15,24,78,95,13,17,33,22,45};
        selectionSort(intArr);
        //print the  int type of array
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }


    public static void selectionSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < intArray.length - 1; j++) {
                if (intArray[minIndex] > intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[minIndex];
                    intArray[minIndex] = temp;
                }
            }
        }
    }
}

