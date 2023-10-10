package Recurssion;
public class Fibo {
    public static void fibonacci(int a, int b, int n){
        if(n==0)
            return;
        if(a==0 && b==1)
            System.out.print(a+" "+b+" ");
        else
            System.out.print(b+" ");
        fibonacci(b, a+b, n-1);
    }    

    public static void main(String[] args) {
        fibonacci(0, 1, 8);
    }
}
