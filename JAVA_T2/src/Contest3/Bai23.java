/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // hinh so 1
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(cnt++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        // hinh so 2
        for (int i = 1; i <= n; i++) {
            int temp = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(temp++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        // hinh so 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j > n - i) {
                    System.out.print(i);
                } else {
                    System.out.print("~");
                }
            }
            System.out.println();
        }
        System.out.println();

        // hinh so 4
        // in cot truoc, in hang sau
        int cnt2 = 1;
        int[][] array = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    array[j][i] = cnt2++;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
