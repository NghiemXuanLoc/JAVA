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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNgay = sc.nextInt();
        System.out.println(soNgay/365 + " " + soNgay%365/7 + ' ' + soNgay%365%7);
    }
}
