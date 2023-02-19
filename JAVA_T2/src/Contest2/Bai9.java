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
public class Bai9 {
    public static boolean checkLeapYear(int N){
        if (N % 400 == 0 || (N % 4 == 0 && N % 100 != 0)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nam = sc.nextInt();
        if (checkLeapYear(nam)) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
