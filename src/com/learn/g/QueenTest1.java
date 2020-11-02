package com.learn.g;

import java.util.Arrays;

/**
 * @author admin
 * @create 2020/10/19
 */
public class QueenTest1 {


    public static final int QUEEN_COUNT = 5;

    public static void main(String[] args) {
        int[] a = new int[QUEEN_COUNT];
        place(a, 0);

    }

    static void place(int[] a, int row) {
        //递归终止条件 -- 所有皇后都找到了自己的位置
        if (row == QUEEN_COUNT) {
            System.out.println(Arrays.toString(a));
            return;
        }

        //放第row行
        for (a[row] = 0; a[row] < QUEEN_COUNT; a[row]++) {
            //不可安放就继续
            if (!isMountable(a, row)) {
                continue;
            }
            //放下一行
            place(a, row + 1);
        }
    }

    /**
     * @Description 比较前row行当前位置之前是否有同列和同一条斜线的,
     * 看此处是否能安放
     * @param a
	 * @param row 当前行
     * @return true此处可以安放,false不可安放
     * @author nisu
     * @date 15:34 2020/10/19
     */


    private static boolean isMountable(int[] a, int row) {
        for (int i = 0; i < row; i++) {
            if (a[row] == a[i] || a[row] - a[i] == row - i || a[row] - a[i] == i - row) {
                return false;
            }
        }
        return true;
    }

}
