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
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("UPPER");
        } else if (c >= 97 && c <= 122) {
            System.out.println("LOWER");
        } else if (c >= 48 && c <= 57) {
            System.out.println("DIGIT");
        } else {
            System.out.println("SPECIAL");
        }
    }
}

