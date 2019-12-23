package com.study.dailylearning.sortalgorithm;

/**
 * @program: dailylearning
 * @description: 基本思想：两个数比较大小，较大的数下沉，较小的数冒起来。
 * @author: XuHang
 * @create: 2019-12-18
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArr = {15,24,78,95,13,17,33,22,45};
        bubbleSort3(intArr);

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }


    public static void bubbleSort(int[] intArr) {
        //表示趟数，一共arr.length-1次。
        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = intArr.length-1; j > i; j--) {
                if (intArr[j] < intArr[j-1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j-1];
                    intArr[j-1] = temp;
                }
            }
        }
    }


    public static void bubbleSort3(int[] intArr) {
        //the times of loop
        for (int i = 0; i < intArr.length-1; i++) {
            for (int j = 0; j < intArr.length - 1; j++) {
                if (intArr[j] > intArr[j+1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }
    }



    public static void bubbleSort2(int[] intArr) {
        boolean flag;
        for (int i = 0; i < intArr.length - 1; i++) {
            flag = false;
            for (int j = intArr.length - 1; j > i; j--) {
                if (intArr[j] < intArr[j-1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j-1];
                    intArr[j-1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }




}

