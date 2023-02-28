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
public class Bai63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fibo = new long[1000005];
        fibo[1] = 0;
        fibo[2] = 1;
        int temp = 1000000007;
        for (int i = 3; i <= 1000000; i++) {
            fibo[i] = (fibo[i - 1] % temp + fibo[i - 2] % temp) % temp;
        }
        int n = sc.nextInt();
        System.out.println(fibo[n]);
    }
}
