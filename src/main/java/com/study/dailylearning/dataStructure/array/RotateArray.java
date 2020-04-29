package com.study.dailylearning.dataStructure.array;

/**
 * @program: dailylearning
 * @description:
 * @create: 2020-04-20
 **/
public class RotateArray {

    void leftRotate(int[] array, int d, int n) {

        for (int i = 0; i < d; i++) {
            leftRotateByOne(array,n);
        }




    }

    private void leftRotateByOne(int[] array, int n) {
        int i, temp;
        temp = array[0];
        for ( i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = temp;
    }


}

