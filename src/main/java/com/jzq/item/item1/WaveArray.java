package com.jzq.item.item1;

import java.util.Arrays;

public class WaveArray {
    //原数组是否为波动数组
    public static boolean isWaveArray(int[] arr) {
        int n = arr.length;
        int i = 1;
        //波动数组的值需要大于3
        if (n < 3) {
            return false;
        }
        while (i + 1 < n) {
            if (arr[i] > Math.max(arr[i - 1], arr[i + 1])) {
                i++;
            } else if (arr[i] < Math.min(arr[i - 1], arr[i + 1])) {
                i++;
            } else {
                return false;
            }
        }
        return i == n - 1;
    }

    //针对有序数组，返回波动数据
    public static int[] swapArray(int[] arr) {
        //如果数组为空，报异常
        if(arr == null){
            throw new RuntimeException("初始数组不能为空");
        }
        //拷贝数组，避免对原数组
        int[] result = arr.clone();
        //对数组排序
        Arrays.sort(result);
        int j = arr.length - 1;
        int temp = 0;
        //原数组是否是波动数组
        if (isWaveArray(result)) {
            return result;
        }
        if (result.length % 2 == 1) {
            //数组个数为单数，从第二位开始遍历数组长度的二分之一
            for (int i = 1; i < result.length / 2 + 1; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
            }
        } else {
            //数组个数为双数，从第一位开始遍历数组长度的二分之一
            for (int i = 0; i < result.length / 2; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
            }
        }

        return result;
    }
    //针对有序数组，返回对调次数
    public static int sumSwapArray(int[] arr) {
        //如果数组为空，报异常
        if(arr == null){
            throw new RuntimeException("初始数组不能为空");
        }
        //拷贝数组，避免对原数组
        int[] result = arr.clone();
        //对数组排序
        Arrays.sort(result);
        int j = result.length - 1;
        int count = 0;
        int temp;
        if (result.length % 2 == 1) {
            //数组个数为单数，从第二位开始遍历数组长度的二分之一
            for (int i = 1; i < result.length / 2 + 1; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
                count++;
            }
        } else {
            //数组个数为双数，从第一位开始遍历数组长度的二分之一
            for (int i = 0; i < result.length / 2; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
                count++;
            }
        }

        return count;
    }
}
