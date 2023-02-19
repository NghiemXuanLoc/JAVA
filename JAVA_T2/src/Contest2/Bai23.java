/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int buocMin = n / 2 + n % 2;
        long thoanMan = (long)(buocMin + m - 1) / m * m;
        if (thoanMan <= n) {
            System.out.println(thoanMan);
        } else {
            System.out.println(-1);
        }
    }
}
