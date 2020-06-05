package com.study.dailylearning.algorithm.sortalgorithm;

/**
 *
 * @description:
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 * 我的比较的次数更少
 * @create: 2019-12-21
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,5,4,6,0,3};
        selectionSort(array);
    }


    public static void selectionSortMyself(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int currentVal = array[i];
            int tmpIndex = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < currentVal) {
                    currentVal = array[j];
                    tmpIndex = j;
                }
                ArrPrintUtil.print(array);
            }
            if (tmpIndex > 0) {
                int tmpValue = array[tmpIndex];
                array[tmpIndex] = array[i];
                array[i] = tmpValue;
            }
        }
    }


    //标准答案
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
                ArrPrintUtil.print(array);
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

}

