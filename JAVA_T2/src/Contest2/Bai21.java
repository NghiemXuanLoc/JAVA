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
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        long phaiA, traiB;
        if (k % 2 == 0) {
            phaiA = 1l*a*(k/2);
            traiB = 1l*b*(k/2);
        }else {
            phaiA = 1l*a*(k/2 + 1);
            traiB = 1l*b*(k/2);
        }
        System.out.println((phaiA - traiB));
        
    }
}