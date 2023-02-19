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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14d;
        long R = sc.nextLong();
        System.out.printf("%.4f %.4f\n", 2*PI*R, PI*R*R);
    }
}
