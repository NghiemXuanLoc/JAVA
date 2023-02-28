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
public class Bai15 {

    public static boolean sphenic(long n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                int res = 0;
                while (n % i == 0) {
                    res++;
                    n /= i;
                }
                if (res >= 2) {
                    return false;
                }
            }
        }
        if (n != 1) {
            cnt++;
        }
        return cnt == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (sphenic(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
