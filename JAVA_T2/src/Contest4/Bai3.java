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
public class Bai3 {

    public static void sang(int[] a) {
        for (int i = 0; i <= (1000000); i++) {
            a[i] = 1;
        }
        a[0] = a[1] = 0;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (a[i] == 1) {
                for (int j = i * i; j <= 1000000; j += i) {
                    a[j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] a = new int[1000005];
        sang(a);
        while (t-- != 0) {
            int n = sc.nextInt();
            if (a[n] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
