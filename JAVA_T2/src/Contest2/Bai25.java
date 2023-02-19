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
public class Bai25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int toTienMin;
        toTienMin = n / 100;
        toTienMin += n % 100 / 20;
        toTienMin += n % 100 % 20 / 10;
        toTienMin += n % 100 % 20 % 10 / 5;
        toTienMin += n % 100 % 20 % 10 % 5;
        System.out.println(toTienMin);
    }
}
