/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n >= 10) {
            long ans = 0;
            long temp = n;
            while (temp != 0) {
                ans += temp % 10;
                temp /= 10;
            }
            n = ans;
        }
        System.out.println(n);
    }
}
