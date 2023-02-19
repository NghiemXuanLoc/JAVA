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
public class ProblemE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a != 0) {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("VO NGHIEM");
            } else if (delta == 0) {
                System.out.printf("%.2f\n", (double)-b / (2 * a));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("%.2f %.2f\n", Math.min(x1, x2), Math.max(x1, x2));
            }
        } else {
            if (b == 0 && c != 0) {
                System.out.println("VO NGHIEM");
            } else if (b == 0 && c == 0) {
                System.out.println("VO SO NGHIEM");
            } else {
              
                System.out.printf("%.2f\n", (double)-c / b);
            }
        }
    }
}
