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
public class Bai16 {

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static int tongChuSo(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean tongGiaiThua(int n) {
        int sum = 0, temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                sum += tongChuSo(i);
                n /= i;
            }
        }
        if (n != 1) {

            sum += tongChuSo(n);
        }
        return sum == tongChuSo(temp);
    }

    public static boolean smith(int n) {
        int temp = n;
        return !snt(n) && tongGiaiThua(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (smith(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
