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
public class Bai36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n * 2 - 1; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (i <= n) {
                    if ((j >= n - (i - 1) && j <= n + (i - 1))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                } else {
                    if ((j >= i - n + 1) && (j <= 2 * n - 1 - (i - n))) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println("");
        }
    }
}
