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
public class Bai11 {

    public static void uocMin(int[] a, int n) {
        for (int i = 1; i <= 100000; i++) {
            a[i] = i;
        }
        a[1] = 1;
        a[2] = 2;
        for (int i = 2; i <= Math.sqrt(100000); i++) {
            if (a[i] == i) {
                for (int j = i * i; j <= 100000; j += i) {
                    if (a[j] == j) {
                        a[j] = i;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100005];
        uocMin(a, n);
    }
}
