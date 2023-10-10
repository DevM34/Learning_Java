package Recurssion.RecursionEasy;

import java.util.Scanner;

public class CalculatePower {
    
    //Calculating power of a number
    public static int power(int n, int p){
        if(n == 0)
            return 0;
        if(n==1 || p==0)
            return 1;
        return n*power(n,(p-1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Enter power: ");       //Calculating Power
        int p = sc.nextInt();
        int po = power(n,p);
        System.out.println(po);
        sc.close();
    }
}
