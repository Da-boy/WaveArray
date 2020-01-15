package com.jzq.item.item1;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

import static com.jzq.item.item1.WaveArray.*;

public class Main {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] arr4 = {19, 82, 7, 1, 2, 3, 4, 5, 55, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        System.out.println(Arrays.toString(swapArray(arr0)));//打印波动数组结果
        System.out.println("对调次数：" + sumSwapArray(arr0));//交换次数
        System.out.println(Arrays.toString(swapArray(arr1)));//打印波动数组结果
        System.out.println("对调次数：" + sumSwapArray(arr1));//交换次数
        System.out.println(Arrays.toString(swapArray(arr2)));//打印波动数组结果
        System.out.println("对调次数：" + sumSwapArray(arr2));//交换次数
        System.out.println(Arrays.toString(swapArray(arr3)));//打印波动数组结果
        System.out.println("对调次数：" + sumSwapArray(arr3));//交换次数
        System.out.println(Arrays.toString(swapArray(arr4)));//打印波动数组结果
        System.out.println("==========================================================================");
        System.out.println("请输入数组内数字个数");

        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int N = input.nextInt();
            System.out.println("请输入数组内数字");
            int[] rank = new int[N];
            for(int i = 0; i < N; i++) {
                rank[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(rank));
            System.out.println(Arrays.toString(swapArray(rank)));//打印波动数组结果
            System.out.println("对调次数：" + sumSwapArray(rank));//交换次数
        }
        input.close();


    }
}
