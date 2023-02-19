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
public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((long)n * 2 + "\n");
        System.out.println((long)n * 10 + "\n");
        System.out.println(n / 2 + "\n");
        System.out.printf("%.3f\n", (double)n / 2);
    }
}
