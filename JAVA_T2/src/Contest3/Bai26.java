/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.*;

/**
 *
 * @author PC
 */
public class Bai26 {

    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        int temp = 0;
        for (int i = 0; i <= n / Math.min(a, b); i++) {
            for (int j = 0; j <= Math.min(a, b); j++) {
                if (a * i + b * j == n) {
                    System.out.println("YES");
                    return 0;
                }
            }
        }
        if (temp == 0) {
            System.out.println("NO");
        }
    }

}
