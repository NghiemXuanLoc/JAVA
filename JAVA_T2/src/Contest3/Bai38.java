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
public class Bai38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(0);
                    } else {
                        System.out.print(1);
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println("");
        }

    }
}
