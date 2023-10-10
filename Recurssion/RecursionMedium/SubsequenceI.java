package Recurssion.RecursionMedium;
import java.util.Scanner;
public class SubsequenceI {
    // Subsequences of String
    public static void subsequence(String st, int a, String stx){
        if(a==st.length()){
            System.err.println(stx);
            return;
        }
        char currChar = st.charAt(a);
        
        subsequence(st,a+1,stx+currChar);
        
        subsequence(st,a+1,stx);
    }

    public static void main(String[] args) {
        // Subsequences of a string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subsequence(str, 0, "");
        sc.close();
    }
}
