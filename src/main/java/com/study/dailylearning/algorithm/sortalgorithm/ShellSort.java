package com.study.dailylearning.algorithm.sortalgorithm;

/**
 *
 * @description:
 * @create: 2019-12-25
 **/
public class ShellSort {


    public static void main(String[] args) {
        int[] numArr = {8,9,1,7,2,5,4,6,0};
        ArrPrintUtil.print(numArr);
        System.out.println("原始数组");
        ShellSort(numArr);
    }



    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
                ArrPrintUtil.print(array);

            }
            gap /= 2;
        }
        return array;
    }

}

