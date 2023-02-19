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
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 1;
        for (int i = 0; i < n; i++) {
            int ans = sc.nextInt();
            if (ans == 2022) {
                System.out.println("YES");
                temp = 0;
                break;
            }
        }
        if (temp == 1) {
            System.out.println("NO");
        }
    }
}
