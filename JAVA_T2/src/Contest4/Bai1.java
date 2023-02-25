/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai1 {

    public static boolean snt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (snt(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
