/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai17 {

    public static void uocMax(long n) {
        long res = -1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                res = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            res = n;
        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long n = sc.nextLong();
            uocMax(n);
        }
    }
}
