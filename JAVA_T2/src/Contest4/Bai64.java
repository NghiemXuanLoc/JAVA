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
public class Bai64 {

    public static boolean fibo(long n) {
        long fn2 = 0, fn1 = 1;
        long fn = fn1 + fn2;
        if (n == 0) {
            return true;
        }
        while (fn <= n) {
            if (fn == n) {
                return true;
            }
            fn2 = fn1;
            fn1 = fn;
            fn = fn1 + fn2;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (fibo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
