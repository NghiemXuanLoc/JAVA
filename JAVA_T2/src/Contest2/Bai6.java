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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if (N % 3 == 0 && N % 7 != 0) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if (N % 3 == 0 || N % 7 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if (N > 30 && N < 50) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if ((N >= 30) && (N % 2 == 0 || N % 3 == 0 || N % 5 == 0)) {
            System.out.println("YES");
        }else System.out.println("NO");
                
        if (N >= 10 && N <= 99 && (N % 10 == 2 || N % 10 == 3 || N % 10 == 5 || N % 10 == 7)) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if (N <= 100 && N % 23 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
//        
        if (N < 10 || N > 20) {
            System.out.println("YES");
        }else System.out.println("NO");
        
        if ((N % 10) % 3 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
