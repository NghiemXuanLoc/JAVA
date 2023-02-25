/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long giaiThua = 1;
        long min_val = Math.min(a, b);
        for (int i = 1; i <= min_val; i++) {
            giaiThua *= i;
        }
        System.out.println(giaiThua);
    }
}
