/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 65;
        // dong le in hoa, dong chan in thuong;
        for (int i = 1; i <= n; i++) {
            int temp1 = ans, temp2 = ans;
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print((char) temp1++);
                } else {
                    System.out.print((char) (temp1++ + 32));
                }
                if (j == n) {
                    ans++;
                }
            }
            System.out.println("");
        }
    }
}
