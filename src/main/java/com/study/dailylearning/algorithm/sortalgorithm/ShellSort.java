package com.study.dailylearning.algorithm.sortalgorithm;

/**
 *
 * @description:
 * @create: 2019-12-25
 **/
public class ShellSort {


    public static void main(String[] args) {
        int[] array = {8,9,1,7,2,5,4,6,0,3};
        shellSortMyself(array);
    }


    public static void shellSortMyself(int[] array) {
        int length = array.length;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int preIndex = i - gap;
                while (preIndex >= 0 && array[gap] < array[preIndex]) {
                    int tmp = array[gap];
                    array[gap] = array[preIndex];
                    array[preIndex] = tmp;
                    preIndex -= gap;
                }
            }
            ArrPrintUtil.print(array);
        }

    }



        public static int[] shellSortAnswer(int[] array) {
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
            }
            gap /= 2;
            ArrPrintUtil.print(array);
        }
        return array;
    }

}

