package Recurssion.RecursionEasy;

import java.util.Scanner;

public class PrintInAscendingOrder {
    // Printing in Ascending Order
    public static void printAsc(int n){
        if(n==0)
            return;
        printAsc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printAsc(n); 
        sc.close();
    }
}
