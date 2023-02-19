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
public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println((long) a * b);
        if (b == 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.4f", (double) a / b);
        }

    }

}
