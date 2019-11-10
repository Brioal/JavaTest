package com.company;

import java.util.Stack;

public class Main4 {

    public static void main(String[] args) {
        String str1 = "BDCABA";
        String str2 = "ABCBDAB";
        StringBuilder lcs = new StringBuilder();
        int result = LCS(str1, str2, lcs);
        System.out.println(result);
        System.out.println(lcs);

    }

    public static int LCS(String str1, String str2, StringBuilder lcs) {
        Stack<Character> stack = new Stack<Character>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int[][] c = new int[str1.length() + 1][str2.length() + 1];//构建m+1,n+1的二维数组
        for (int row = 0; row <= str1.length(); row++) {//第0行全部填充0
            c[row][0] = 0;
        }
        for (int column = 0; column <= str2.length(); column++) {//第0列全部填充0
            c[0][column] = 0;
        }

        for (int i = 1; i < c1.length; i++) {
            for (int j = 1; j < c2.length; j++) {
                if (c1[i] == c2[j]) {//如果若xm=yn，则zk=xm=yn且Zk-1是Xm-1和Yn-1的最长公共子序列
                    c[i][j] = c[i - 1][j - 1] + 1;
                }
                else {
                    c[i][j] = Math.max(c[i][j - 1], c[i - 1][j]);
                }
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (j < str2.length()-1) {
                    System.out.print(c[i][j]+" , ");
                }else {
                    System.out.print(c[i][j]);
                }
            }
            System.out.println("\n");
        }

        int i = c1.length-1;
        int j = c2.length-1;
        while( i>=0 && j>=0){//从后往前遍历字符串,入栈
            if (c1[i] == c2[j]) {
                stack.push(c1[i]);
                i--;
                j--;
            }else {
                if (c[i][j-1] > c[i-1][j]) {
                    j--;
                }else {
                    i--;
                }
            }
        }
        while (!stack.isEmpty()) {
            lcs.append(stack.pop());//出栈,类似于做了个字符串反转
        }
        return c[str1.length()][str2.length()];

    }
}
