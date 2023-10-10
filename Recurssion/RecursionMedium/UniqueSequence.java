package Recurssion.RecursionMedium;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSequence {
    
    // Unique Subsequence
    public static void uniqueSubSeq(String str, int a, String st, HashSet<String> set){
        if(a==str.length()){
            if(!set.contains(st)){
                set.add(st);
                System.out.println(st);
            }
            return;
        }
        char currChar = str.charAt(a);
        uniqueSubSeq(str, a+1, st+currChar, set);

        uniqueSubSeq(str, a+1, st, set);
    }

    public static void main(String[] args) {
        // Unique Subsequence 
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        uniqueSubSeq(str, 0, "", set);
        sc.close();
    }
}
