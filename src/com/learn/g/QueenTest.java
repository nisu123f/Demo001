package com.learn.g;

import java.util.Arrays;

/**
 * @author admin
 * @create 2020/10/19
 */
public class QueenTest {


    public static final int QUEEN_COUNT = 5;

    public static void main(String[] args) {
        int[] a = new int[QUEEN_COUNT];
        place(a, 0);

    }

    static void place(int[] a, int row) {
        //递归终止条件 -- 所有皇后都找到了自己的位置
        if (row == QUEEN_COUNT) {
            System.out.println(Arrays.toString(a));
//            for (int i = 0; i < QUEEN_COUNT; i++) {
//                System.out.print(a[i] + "\t");
//            }
//            System.out.println();
            return;
        }

        //放第row行
        outer:
        for (a[row] = 0; a[row] < QUEEN_COUNT; a[row]++) {
            for (int i = 0; i < row; i++) {
                if (a[row] == a[i] || a[row] - a[i] == row - i || a[row] - a[i] == i - row) {
                    continue outer;
                }
            }
            //row+1行
            place(a, row + 1);
        }
    }

}
