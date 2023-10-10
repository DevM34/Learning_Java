package Recurssion.RecursionMedium;
public class ReverseString {
    // Returning a reversed string
    public static String revString(String str,int n, String rev){
        if(n==0){
            rev+=str.charAt(n);
            return rev;
        }
        rev+=str.charAt(n);
        return revString(str,n-1,rev);
    }


    // Printing a reversed string
    // public static void printRev(String str, int n){
    //     if(n==0){
    //         System.out.println(str.charAt(n));
    //         return;
    //     }
    //     System.out.print(str.charAt(n));
    //     printRev(str,n-1);
    // }

    
    public static void main(String[] args) {
        String str ="Dev Marlecha";

        // Reverse String
        String st = revString(str,str.length()-1,"");
        System.out.println(st);

        // Printing Reverse String
        // printRev(str, str.length()-1);
    }
}
