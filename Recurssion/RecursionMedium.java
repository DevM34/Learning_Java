package Recurssion;
import java.util.*;
import java.util.HashSet;

public class RecursionMedium {
    
    // Returning a reversed string
    // public static String revString(String str,int n, String rev){
    //     if(n==0){
    //         rev+=str.charAt(n);
    //         return rev;
    //     }
    //     rev+=str.charAt(n);
    //     return revString(str,n-1,rev);
    // }


    // Printing a reversed string
    // public static void printRev(String str, int n){
    //     if(n==0){
    //         System.out.println(str.charAt(n));
    //         return;
    //     }
    //     System.out.print(str.charAt(n));
    //     printRev(str,n-1);
    // }


    // First and last occurence
    // public static int f = -1;
    // public static int l = -1;

    // public static void occChar(String str, char ch, int n){
    //     if(n==str.length()-1){
    //         System.out.println("First Occurence: "+f);
    //         System.out.println("Last Occurence: "+l);
    //         return;
    //     }
    //     char currChar = str.charAt(n);
    //     if(currChar==ch){
    //         if(f==-1)
    //             f=n;
    //         else
    //             l = n;
    //     }
    //     occChar(str, currChar, n+1);
    // }


    // Sorted or not Array
    // public static boolean sortedArr(int[] arr, int b){
    //     if(b==arr.length-1)
    //         return true;
    //     if(arr[b]>arr[b+1])
    //         return false;
    //     return sortedArr(arr, b+1);
    // }


    // Remove x from string using stringbuilder
    // public static StringBuilder removeX(StringBuilder str, int a, int x){
    //     if(a==str.length()){
    //         System.out.println(str.toString().substring(0, a));
    //         return str;
    //     }
    //     char currChar = str.charAt(a);
    //     if(currChar!='x'){
    //         str.setCharAt(x, str.charAt(a));
    //         x++;
    //     }
    //     return removeX(str,a+1,x);
    // }


    //Remove x using another string

    // public static String removeX(String str, int a, String stx, int b){
    //     if(a==str.length()){
    //         for(int i=0;i<b;i++){
    //             stx+='x';
    //         }
    //         return stx;
    //     }
    //     if(str.charAt(a)!='x')
    //         stx+=str.charAt(a);
    //     else
    //         b++;
    //     return removeX(str,a+1,stx,b);
    // }


    //Remove Duplicates
    // public static boolean[] map = new boolean[26];

    // public static String removeDup(String str, int a,String stx){
    //     if(a==str.length()){
    //         return stx;
    //     }
    //     char currChar = str.charAt(a);
    //     if(!map[currChar-'a']){
    //         stx+=currChar;
    //         map[currChar-'a']=true;
    //     }
    //     return removeDup(str,a+1,stx);

    // }


    // Subsequences of String
    // public static void subsequence(String st, int a, String stx){
    //     if(a==st.length()){
    //         System.err.println(stx);
    //         return;
    //     }
    //     char currChar = st.charAt(a);
        
    //     subsequence(st,a+1,stx+currChar);
        
    //     subsequence(st,a+1,stx);
    // }


    // Unique Subsequence
    // public static void uniqueSubSeq(String str, int a, String st, HashSet<String> set){
    //     if(a==str.length()){
    //         if(!set.contains(st)){
    //             set.add(st);
    //             System.out.println(st);
    //         }
    //         return;
    //     }
    //     char currChar = str.charAt(a);
    //     uniqueSubSeq(str, a+1, st+currChar, set);

    //     uniqueSubSeq(str, a+1, st, set);
    // }




    public static void main(String[] args) {
        //String str ="Dev Marlecha";

        // Reverse String
        // String st = revString(str,str.length()-1,"");
        // System.out.println(st);
        
        // Printing Reverse String
        // printRev(str, str.length()-1);

        // First and last Occurence
        // String str="abaaachaalo";
        // occChar(str, 'a', 0);


        //Sorted arra or not
        // int[] a = {1,3,4,5};
        // boolean ans = sortedArr(a, 0);
        // System.out.println(ans);


        // Remove X from String using stringbuilder
        
        // System.out.println("Enter string: ");
        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        
        // sc.close();
        // StringBuilder sb = removeX(str, 0, 0);
        // System.out.println(sb);

        // Remove X using another string
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String str = sc.nextLine();
        // str = removeX(str,0,"",0);
        // System.out.println(str);
        // sc.close();

        // Remove Duplicates
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // str = removeDup(str, 0, "");
        // System.out.println(str);
        // sc.close();


        // Subsequences of a string
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // subsequence(str, 0, "");
        // sc.close();


        // Unique Subsequence 
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // HashSet<String> set = new HashSet<>();
        // uniqueSubSeq(str, 0, "", set);
        // sc.close();

    }
}
