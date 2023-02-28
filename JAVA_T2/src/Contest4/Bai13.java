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
public class Bai13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = sc.nextInt();
        long cnt = 0, temp = 1;
        while ((long) Math.pow(p, temp) <= n) {
            cnt += n / (long) Math.pow(p, temp++);
        }
        System.out.println(cnt);
    }
}
