package Recurssion;
import java.util.Scanner;

class RecurssionEasy{
    // Printing in Ascending Order
    // public static void printAsc(int n){
    //     if(n==0)
    //         return;
    //     print(n-1);
    //     System.out.println(n);
    // }
    
    // Printing in Descending order
    // public static void printDesc(int n){
    //     if(n==0)
    //         return;
    //     System.out.println(n);
    //     printDesc(n-1);
    // }

    // Calculating sum of n numbers
    // public static void sum(int n,int s){
    //     if(n==0){
    //         System.out.println(s);
    //         return;
    //     }
    //     s = s + n;
    //     sum(n-1,s);
    // }

    // Calculating factorial of n numbers without returning
    // public static void fact(int n, int f){
    //     if(n==0||n==1){
    //         System.out.println(f);
    //         return;
    //     }
    //     f = f*n;
    //     fact(n-1,f);
    // }


    // Calculating factorial of n numbers with returning 
    // public static int fact1(int n){
    //     if(n==0||n==1)
    //         return 1;
    //     return n*fact1(n-1);
    // }

    // Printing Fibonaci Series
    // public static void fibo(int n,int a,int b){
    //     if(n==0){
    //         return;
    //     }
    //     if(a==0 && b==1)
    //         System.out.print(a+" "+b+" ");
    //     else
    //         System.out.print(b+" ");
    //     fibo((n-1),b,a+b);
    // }
    
    //Calculating power of a number
    // public static int power(int n, int p){
    //     if(n == 0)
    //         return 0;
    //     if(n==1 || p==0)
    //         return 1;
    //     return n*power(n,(p-1));
    // }

    //Calculating power using stack height logn
    // public static int powerp(int n,int p){
    //     if(n==0)
    //         return 0;
    //     if(n==1 || p==0)
    //         return 1;
    //     if(p%2==0)
    //         return powerp(n,p/2) * powerp(n,p/2);
    //     else
    //         return n * powerp(n,p/2) * powerp(n,p/2);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        //printAsc(n);                                Print in Asc order
        //printDesc(n);                               Print in Desc order
        //sum(n,0);                                   Calculating sum and printing
        //fact(n,1);                                  Calculating factorial and printing
        //int fa = fact1(n);                          Calculating factorial and returning
        //System.out.println(fa);
        //fibo(n,0,1);                                Priniting Fibonacci Series
        // System.out.println("Enter power: ");       Calculating Power
        // int p = sc.nextInt();
        // int po = power(n,p);
        // System.out.println(po);
        // System.out.println("Enter power: ");       //Calculating Power
        // int p1 = sc.nextInt();
        // int po1 = powerp(n,p1);
        // System.out.println(po1);

        sc.close();
    }
}