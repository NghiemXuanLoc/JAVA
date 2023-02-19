/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), a = sc.nextInt();
        System.out.println(a/b);
        System.out.printf("%.2f\n", (float)a/b);
    }
}
