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
public class Bai30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
            t--;
        }
    }
}
