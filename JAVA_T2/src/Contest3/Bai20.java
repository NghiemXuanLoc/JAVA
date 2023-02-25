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
public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 1) {
            if (n % 2 == 0) {
                System.out.println(n / 2);
                for (int i = 1; i <= n / 2; i++) {
                    System.out.print(2 + " ");
                }
            } else {
                System.out.println(n / 2);
                for (int i = 1; i <= n / 2 - 1; i++) {
                    System.out.print(2 + " ");
                }
                System.out.println(3);
            }
        } else {
            System.out.println(-1);
        }
        System.out.println();
    }
}
