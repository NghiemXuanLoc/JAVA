/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), t = sc.nextInt();
        System.out.println(Math.max(z, y));
        System.out.println(Math.min(z, t));
        System.out.println(Math.max(Math.max(x, y), z));
        System.out.println(Math.min(Math.min(x, y), Math.min(z, t)));
    }
}
