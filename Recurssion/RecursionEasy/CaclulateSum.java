package Recurssion.RecursionEasy;

import java.util.Scanner;

public class CaclulateSum {
    // Calculating sum of n numbers
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        s = s + n;
        sum(n-1,s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sum(n,0);
        sc.close();
    }
}
