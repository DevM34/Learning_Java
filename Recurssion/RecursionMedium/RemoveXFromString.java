package Recurssion.RecursionMedium;

import java.util.Scanner;

public class RemoveXFromString {

    // Remove x from string using stringbuilder
    public static StringBuilder removeX(StringBuilder str, int a, int x){
        if(a==str.length()){
            System.out.println(str.toString().substring(0, a));
            return str;
        }
        char currChar = str.charAt(a);
        if(currChar!='x'){
            str.setCharAt(x, str.charAt(a));
            x++;
        }
        return removeX(str,a+1,x);
    }

    public static void main(String[] args) {
        // Remove X from String using stringbuilder
        
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        
        sc.close();
        StringBuilder sb = removeX(str, 0, 0);
        System.out.println(sb);
    }
}
