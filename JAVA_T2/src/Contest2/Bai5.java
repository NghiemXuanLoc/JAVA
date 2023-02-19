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
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        double khoangCach = Math.sqrt((long)(x2 - x1)*(x2-x1) + (long)(y2 - y1)*(y2 - y1));
        System.out.printf("%.2f\n", khoangCach);
    }
}
