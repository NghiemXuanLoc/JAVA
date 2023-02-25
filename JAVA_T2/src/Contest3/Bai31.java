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
public class Bai31 {

    public static long gt(int n) {
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            tich *= i;
        }
        return tich;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double e = 1d;
        for (int i = 1; i <= n; i++) {
            e += (double) 1 / gt(i);
        }
        System.out.printf("%.2f\n", e);
    }
}
