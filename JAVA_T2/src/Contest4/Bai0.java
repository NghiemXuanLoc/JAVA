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
public class Bai0 {

    public static boolean ham1(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static int ham2(int n) {
        int tong = 0;
        while (n != 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    public static int ham3(int n) {
        int tong = 0;
        while (n != 0) {
            if (n % 10 % 2 == 0) {
                tong += n % 10;
            }
            n /= 10;
        }
        return tong;
    }

    public static int ham4(int n) {
        int tong = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7) {
                tong += temp;
            }
            n /= 10;
        }
        return tong;
    }

    public static void ham5(int n) {
        int ans = 0;
        ans = n % 10;
        n /= 10;
        while (n != 0) {
            ans *= 10;
            ans += n % 10;
            n /= 10;
        }
        System.out.println(ans);
    }

    public static int ham6(int n) {
        int temp = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                temp++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            temp++;
        }
        return temp;
    }
    
      public static int ham7(int n) {
        int temp = -1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                temp = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            temp = n;
        }
        return temp;
    }

    public static boolean ham8(int n){
        while(n != 0){
            if(n % 10 == 6) return true;
            n /= 10;
        }
        return false;
    }
    
    public static int giaiThua(int n){
        int temp = 1;
        for(int i = 1;i <= n;i++){
            temp *= i;
        }
        return temp;
    }
    public static int ham10(int n){
        int tong = 0;
        while(n != 0){
            tong += giaiThua(n % 10);
            n /= 10;
        }
        return tong;
    }
    
    public static boolean ham11(int n){
        int temp = n % 10;
        n /= 10;
        while(n != 0){
            if(n % 10 != temp) return false;
            n /= 10;
        }
        return true;
    }
    
    public static boolean ham12(int n){
        int temp = n % 10;
        n /= 10;
        while(n != 0){
            if(n % 10 > temp) return false;
            n /= 10;
        }
        return true;
    }
    
    public static int ham13(int n){
        int temp = n;
        int soChuSo = 0;
        while(temp != 0){
            soChuSo++;
            temp /= 10;
        }
        int tong = 0;
        while(n != 0){
            tong += (int)Math.pow(n % 10, soChuSo);
            n /= 10;
        }
        return tong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (ham1(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        System.out.println(ham2(n));

        System.out.println(ham3(n));

        System.out.println(ham4(n));

        ham5(n);

        System.out.println(ham6(n));
        
        System.out.println(ham7(n));
        
        if(ham8(n)) System.out.println(1);
        else System.out.println(0);
        
        if(ham2(n) % 8 == 0) System.out.println(1);
        else System.out.println(0);
        
        System.out.println(ham10(n));
        
        if(ham11(n)) System.out.println(1);
        else System.out.println(0);
        
        if(ham12(n)) System.out.println(1);
        else System.out.println(0);
        
        System.out.println(ham13(n));
    }
}
