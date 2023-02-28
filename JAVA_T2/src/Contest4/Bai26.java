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
public class Bai26 {

    public static boolean hoanHao(long n) {
        for (int i = 1; i <= 32; i++) {
            if ((long)Math.pow(2, i - 1) * ((long)Math.pow(2, i) - 1) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(hoanHao(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
