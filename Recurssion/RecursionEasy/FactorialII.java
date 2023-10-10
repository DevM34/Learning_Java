package Recurssion.RecursionEasy;

import java.util.Scanner;

public class FactorialII {
    // Calculating factorial of n numbers without returning
    public static void fact(int n, int f){
        if(n==0||n==1){
            System.out.println(f);
            return;
        }
        f = f*n;
        fact(n-1,f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        fact(n,1);
        sc.close();
    }
}
