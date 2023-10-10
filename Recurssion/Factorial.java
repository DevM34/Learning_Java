package Recurssion;
class Factorial {
    
    public static int calculateFact(int n){
        if(n==0 || n==1)
            return 1;
        return n*calculateFact(n-1);
    }
    public static void main(String[] args) {
        int fact = calculateFact(5);
        System.out.println(fact);
    }
}
