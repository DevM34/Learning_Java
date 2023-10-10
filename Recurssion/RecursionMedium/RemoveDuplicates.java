package Recurssion.RecursionMedium;
import java.util.Scanner;

public class RemoveDuplicates {
    
    //Remove Duplicates
    public static boolean[] map = new boolean[26];

    public static String removeDup(String str, int a,String stx){
        if(a==str.length()){
            return stx;
        }
        char currChar = str.charAt(a);
        if(!map[currChar-'a']){
            stx+=currChar;
            map[currChar-'a']=true;
        }
        return removeDup(str,a+1,stx);

    }

    public static void main(String[] args) {
        // Remove Duplicates
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = removeDup(str, 0, "");
        System.out.println(str);
        sc.close();
    }
}
