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
public class Bai28 {

    public static boolean locPhat(long n) {
        while (n != 0) {
            long temp = n % 10;
            if (temp != 0 && temp != 6 && temp != 8) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (locPhat(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
