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
public class Bai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n / 28; // dem so luong chia bia mua duoc toi da   
        int chaiBia = n / 28;
        while (chaiBia >= 3) {
            int soBiaDu = chaiBia % 3;
            int soBiaDoiDuoc = chaiBia / 3;
            cnt += chaiBia / 3;
            chaiBia = soBiaDu + soBiaDoiDuoc;
        }
        System.out.println(cnt);
    }
}
