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
public class Bai34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int temp1 = i, temp2 = 2 * i - 2;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((j > n - i && j <= n) || (j > n && j < n + i)) {
                    if (j > n - i && j <= n) {
                        System.out.print(temp1++ + " ");
                    } else {
                        System.out.print(temp2-- + " ");
                    }
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
