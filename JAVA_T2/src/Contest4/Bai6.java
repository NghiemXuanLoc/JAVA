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
public class Bai6 {

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean allSnt(int n) {
        while (n != 0) {
            int temp = n % 10;
            if (temp != 2 && temp != 3 && temp != 5 && temp != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean tongSnt(int n) {
        int tong = 0;
        while (n != 0) {
            tong += n % 10;
            n /= 10;
        }
        return snt(tong);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (allSnt(i) && tongSnt(i) && snt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
