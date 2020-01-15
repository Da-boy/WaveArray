package com.jzq.item.item1;

import java.util.Arrays;

public class WaveArray {
    //原数组是否为波动数组
    public static boolean isWaveArray(int[] arr) {
        int n = arr.length;
        int i = 1;
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
    //针对任意数组(可重复，可乱序)，返回波动数据
    public static int[] changeArray(int[] arr) {
        if (isWaveArray(arr)) {
            return arr;
        }
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int k = (arr.length + 1) / 2;
        int j = arr.length - 1;
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = temp[j];
                j--;
            } else if (l < k) {
                arr[i] = temp[l];
                l++;
            }
        }
        return arr;
    }

    //针对有序数组，返回波动数据
    public static int[] swapArray(int[] arr) {
        if(arr == null){
            throw new RuntimeException("初始数组不能为空");
        }
        int[] result = arr.clone();
        Arrays.sort(result);
        int j = arr.length - 1;
        int temp = 0;
        if (isWaveArray(result)) {
            return result;
        }
        if (result.length % 2 == 1) {
            //数组个数为单数
            for (int i = 1; i < result.length / 2 + 1; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
            }
        } else {
            //数组个数为双数
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
        if(arr == null){
            throw new RuntimeException("初始数组不能为空");
        }
        int[] result = arr.clone();
        Arrays.sort(result);
        int j = result.length - 1;
        int count = 0;
        int temp;
        if (result.length % 2 == 1) {
            //数组个数为单数
            for (int i = 1; i < result.length / 2 + 1; ) {
                temp = result[j];
                result[j] = result[i];
                result[i] = temp;
                j = j - 2;
                i = i + 2;
                count++;
            }
        } else {
            //数组个数为双数
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
