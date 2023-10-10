package Recurssion.RecursionMedium;

public class FirstAndLastOccurence {
   // First and last occurence
    public static int f = -1;
    public static int l = -1;

    public static void occChar(String str, char ch, int n){
        if(n==str.length()-1){
            System.out.println("First Occurence: "+f);
            System.out.println("Last Occurence: "+l);
            return;
        }
        char currChar = str.charAt(n);
        if(currChar==ch){
            if(f==-1)
                f=n;
            else
                l = n;
        }
        occChar(str, currChar, n+1);
    }
    
    public static void main(String[] args) {
        //First and last Occurence
        String str="abaaachaalo";
        occChar(str, 'a', 0);
    }

}
