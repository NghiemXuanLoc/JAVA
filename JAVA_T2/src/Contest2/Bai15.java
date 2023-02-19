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
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nLitNuoc = sc.nextLong();
        // a la 1 lit, b la 2 lit
        int a = sc.nextInt(), b = sc.nextInt();
        long fullA = nLitNuoc / 2 * b + (nLitNuoc % 2) * a;
        long fullB = nLitNuoc*a;
        if (fullA > fullB) {
            System.out.println(fullB);
        }else System.out.println(fullA);
    }
}
