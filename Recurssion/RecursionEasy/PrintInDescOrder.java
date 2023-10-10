package Recurssion.RecursionEasy;

import java.util.Scanner;

public class PrintInDescOrder {
    
    // Printing in Descending order
    public static void printDesc(int n){
        if(n==0)
            return;
        System.out.println(n);
        printDesc(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printDesc(n);
        sc.close();
    }
}
