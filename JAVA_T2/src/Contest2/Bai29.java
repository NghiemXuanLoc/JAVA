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
public class Bai29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if (b % a != 0) {
            System.out.println("NO");
        } else {
            int temp = b / a;
            if (b * temp != c || c * temp != d) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
