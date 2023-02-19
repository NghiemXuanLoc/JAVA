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
public class Bai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float aHeSo1 = sc.nextFloat(), bHeSo1 = sc.nextFloat(), heSo2 = sc.nextFloat(), heSo3 = sc.nextFloat();
        float diemTrungBinh = (aHeSo1 + bHeSo1 + 2 * heSo2 + 3 * heSo3) / 7;
        if (diemTrungBinh >= 8) {
            System.out.println("GIOI");
        } else if (diemTrungBinh >= 6.5 && diemTrungBinh < 8) {
            System.out.println("KHA");
        } else if (diemTrungBinh >= 5 && diemTrungBinh < 6.5) {
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
    }
}
