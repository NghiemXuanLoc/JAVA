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
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("1");
            } else if (a == b || a == c || b == c) {
                System.out.println("2");
            } else if (b * b == a * a + c * c || a * a == b * b + c * c || c * c == a * a + b * b) {
                System.out.println("3");
            } else { 
                System.out.println("4");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
