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
public class Bai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        a = (long) Math.ceil(Math.sqrt(a));
        b = (long) Math.floor(Math.sqrt(b));
        System.out.println(b - a + 1);
    }
}
