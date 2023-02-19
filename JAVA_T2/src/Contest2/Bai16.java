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
public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c >= 'A' && c < 'Z') {
            c += 33;
        } else if (c == 'Z' || c == 'z') {
            c = 'a';
        } else {
            c += 1;
        }
        System.out.println(c);
    }
}
