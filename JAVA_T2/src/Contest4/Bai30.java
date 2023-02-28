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
public class Bai30 {

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean soCuoiCung(int n) {
        int temp = n % 10;
        n /= 10;
        while (n != 0) {
            if (temp < n % 10) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (snt(i) && soCuoiCung(i)) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("\n" + cnt);
    }
}
