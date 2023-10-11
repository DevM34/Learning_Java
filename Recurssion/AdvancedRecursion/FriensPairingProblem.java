package Recurssion.AdvancedRecursion;

public class FriensPairingProblem {
    
    public static int pairing(int n){
        if(n<=1)
            return 1;
        
        //Single
        int single = pairing(n-1);

        //couple
        int couple = (n-1)*pairing(n-2);

        return single + couple;
        
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(pairing(n));
    }
}
