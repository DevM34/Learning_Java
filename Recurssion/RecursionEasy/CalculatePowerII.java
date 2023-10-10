package Recurssion.RecursionEasy;

import java.util.Scanner;

public class CalculatePowerII {

    //Calculating power using stack height logn
    public static int powerp(int n,int p){
        if(n==0)
            return 0;
        if(n==1 || p==0)
            return 1;
        if(p%2==0)
            return powerp(n,p/2) * powerp(n,p/2);
        else
            return n * powerp(n,p/2) * powerp(n,p/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Enter power: ");       //Calculating Power
        int p1 = sc.nextInt();
        int po1 = powerp(n,p1);
        System.out.println(po1);
        sc.close();
    }
    
}
