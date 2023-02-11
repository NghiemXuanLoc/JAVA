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
public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), t = sc.nextInt();
        System.out.println(x + "  " + y + "  " + z + "  " + t + "\n");
        System.out.println(y + "--" + z + "--" + x + "--" + t + "\n");
        System.out.println(2*x + "," + (long)3*y + "," + (long)4*z + "," + (long)5*t + "\n");
        System.out.println("KET THUC !!");
        
    }
}
