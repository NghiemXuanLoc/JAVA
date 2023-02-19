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
public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), u1 = sc.nextInt(), d = sc.nextInt();
        System.out.println((1l*n*(2*u1 + 1l*(n-1)*d))/2);
    }
}
