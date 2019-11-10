package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] array = new int[128];
        int max = -1;
        int chMax = ' ';
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            array[ch]++;
            int count = array[ch];
            if (count > max) {
                max = count;
                chMax = ch;
            }
        }
        char ch = (char) chMax;
        System.out.println(ch + "--" + max);
    }
}
