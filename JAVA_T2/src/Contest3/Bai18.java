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
public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while (n != 0) {
            long a = (n % 10);
            if (a == 2 || a == 5 || a == 3 || a == 7) {
                cnt++;
            }
            n /= 10;
        }
        System.out.println(cnt);
    }
}
