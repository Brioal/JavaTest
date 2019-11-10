package com.company;

import java.util.Scanner;

/**
 * 高斯消元法
 */
public class Gaosi {

    // 计算结果
    static double result[];
    // 矩阵
    static double matrix[][];
    // 临时存放元素的矩阵
    static double tempCol[];
    static double m;
    // 行数,即元数
    static int rowCount;

    /**
     * 选主元
     *
     * @param k
     */
    static void SelectAndChangeLine(int k) {
        int maxline = k;
        for (int i = k + 1; i < rowCount; i++) {
            if (Math.abs(matrix[i][k]) > matrix[maxline][k]) {
                maxline = i;
            }
        }
        if (maxline != k) {
            for (int j = 0; j < rowCount + 1; j++) {
                tempCol[j] = matrix[k][j];
                matrix[k][j] = matrix[maxline][j];
                matrix[maxline][j] = tempCol[j];
            }
        }
    }

    /**
     * 消元计算
     *
     * @param k
     */
    static void Elimination(int k) {
        for (int i = k + 1; i < rowCount; i++) {
            m = matrix[i][k] / matrix[k][k];
            matrix[i][k] = 0;
            for (int j = k + 1; j < rowCount + 1; j++) {
                matrix[i][j] = matrix[i][j] - m * matrix[k][j];
            }
        }
    }

    /**
     * 回代计算
     */
    static void BacksSubstitution() {
        for (int i = rowCount - 1; i >= 0; i--) {
            for (int j = rowCount - 1; j > i; j--) {
                matrix[i][rowCount] = matrix[i][rowCount] - result[j] * matrix[i][j];
            }
            result[i] = matrix[i][rowCount] / matrix[i][i];
        }
    }

    /**
     * 打印数组
     *
     * @param args
     */
    static void PrintLine(double[] args) {
        for (int j = 0; j < args.length; j++) {
            System.out.print(args[j] + " ");
        }
    }

    /**
     * 打印矩阵
     *
     * @param args
     */
    static void PrintMatrix(double[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 将输入的字符串转化为数组
     *
     * @param line
     * @return
     */
    static double[] convertStrToArray(String line) {
        String[] array = line.split("\\s");
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            Double value = Double.parseDouble(str);
            result[i] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入矩阵的第1行:(数字之间用空格隔开)");
        String line = scanner.nextLine();
        int colCount = line.split("\\s").length;
        rowCount = colCount - 1;
        // 初始化矩阵
        matrix = new double[rowCount][];
        // 第一行赋值
        matrix[0] = convertStrToArray(line);
        for (int i = 1; i < rowCount; i++) {
            // 剩余行数赋值
            System.out.println("输入矩阵的第" + (i + 1) + "行:(数字之间用空格隔开)");
            line = scanner.nextLine();
            matrix[i] = convertStrToArray(line);
        }
        tempCol = new double[rowCount + 1];
        result = new double[rowCount];
        scanner.close();
        for (int i = 0; i < rowCount - 1; i++) {
            SelectAndChangeLine(i);
            System.out.println("第" + (i + 1) + "次换主元");
            PrintMatrix(matrix);
            Elimination(i);
            System.out.println("第" + (i + 1) + "次消元");
            PrintMatrix(matrix);
        }
        BacksSubstitution();
        System.out.println("计算结果:");
        PrintLine(result);
    }

}
