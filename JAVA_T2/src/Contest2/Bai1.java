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
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long A = (long)x*x*x + (long)3*x*x + x + 1;
        System.out.println(A);
    }
}
