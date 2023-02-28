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
public class Bai27 {

    public static boolean thuanNghich(int n) {
        int temp = n, res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res == temp;
    }

    public static boolean uocNT(int n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            cnt++;
        }
        return cnt >= 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        boolean cnt = true;
        for (int i = a; i <= b; i++) {
            if (thuanNghich(i) && uocNT(i)) {
                System.out.print(i + " ");
                cnt = false;
            }
        }
        if (cnt) {
            System.out.println(-1);
        }
    }
}
