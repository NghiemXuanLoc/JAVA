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
public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n;
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n /= 10;
        }
        if (temp != 0) {
            System.out.println(cnt);
        } else {
            System.out.println(1);
        }
    }
}
