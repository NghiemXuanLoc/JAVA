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
public class Bai12 {

    public static boolean checkLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt(), nam = sc.nextInt();
        if (thang >= 1 && thang <= 12 && nam > 0) {
            if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
                System.out.println("31");
            } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                System.out.println("30");
            } else if (checkLeapYear(nam)) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
