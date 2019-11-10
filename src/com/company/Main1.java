package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int all = scanner.nextInt();
        int[] array = new int[days];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // 循环便利
        for (int i = 0; i < array.length; i++) {
            if (all <= 0) {
                System.out.println(i);
                return;
            }
            int count = array[i];
            int left = 0;
            if (count <= 8) {
                all = all - count;
            } else {
                left = count - 8;
                all = all - 8;
            }
            if (i < array.length - 1) {
                array[i + 1] += left;
            }
        }
        System.out.println(array.length);

    }
}
