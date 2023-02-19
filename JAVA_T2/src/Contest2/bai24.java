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
public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        int min1 = d1 + d2 + d3;
        int min2 = 2*d1 + 2*d2;
        int min3 = 2*d1 + 2*d3;
        int min4 = 2*d2 + 2*d3;
        System.out.println(Math.min(Math.min(min1, min2), Math.min(min3, min4)));
    }
}
