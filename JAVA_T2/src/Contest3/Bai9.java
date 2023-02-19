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
public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tich = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                tich *= i;
            }
        }
        System.out.println(tich);
    }
}
