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
public class Bai29 {

    public static boolean thuanNghich(int n) {
        int temp = n, res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res == temp;
    }

    public static boolean so6(int n) {
        while (n != 0) {
            if (n % 10 == 6) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean tongChuSo(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (thuanNghich(i) && so6(i) && tongChuSo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
