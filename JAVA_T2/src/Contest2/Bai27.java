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
public class Bai27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a - (int) a >= 0.5) {
            System.out.println((long)Math.ceil(a));
        } else {
            System.out.println((long)Math.floor(a));
        }
    }
}
