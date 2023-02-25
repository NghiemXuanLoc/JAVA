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
public class Bai25 {

    public static long giaiThua(int n) {
        long temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double thuong = 0;
        for (int i = 1; i <= n; i++) {
            thuong += (double) 1 / giaiThua(i - 1);
        }
        System.out.printf("%.4f\n", thuong);
    }
}
