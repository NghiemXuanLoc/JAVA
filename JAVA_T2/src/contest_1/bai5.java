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
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f\n", Math.sqrt((float)n));
        System.out.printf("%.3f",Math.cbrt((float)n) );
    }
}
