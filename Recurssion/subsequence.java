package Recurssion;
public class subsequence {
    public static void subSequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.err.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        subSequence(str,idx+1,newString+currChar);

        subSequence(str,idx+1,newString);

    }

    public static void main(String[] args) {
        String str ="abc";
        subSequence(str, 0, "");
    }
}
