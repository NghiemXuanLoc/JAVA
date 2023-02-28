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
public class Fibonacci3 {
    public static void fiBo(long n){
        long fn1 = 1, fn2 = 0;
        for(int i = 0;i <= 92;i++){
            long fn = fn1 + fn2;
            if(fn >= n){
                System.out.println(fn);
                break;
            }
            fn2 = fn1;
            fn1 = fn;
        }
    }
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        fiBo(n);
    }
}
