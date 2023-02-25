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
public class Bai0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = n;i >= 0;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0;i <= n;i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
         for(int i = 1;i <= n;i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
         for(int i = 0;i < n;i += 4){
            System.out.print(i + " ");
        }
        System.out.println();
        int cnt = 97;
        for(int i = 1;i <= n;i++){
            System.out.print((char)cnt + " ");
            cnt++;
        }
        System.out.println();
        int temp = 122 - n + 1;
        for(int i = 1;i <= n;i++){
            System.out.print((char)temp + " ");
            temp++;
        }
    }
}
