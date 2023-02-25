/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest4;


import java.util.Scanner;

public class Bai20 {

    public static boolean soChinhPhuong(long n) {
        return Math.sqrt(n) - (int) Math.sqrt(n) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (soChinhPhuong(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
