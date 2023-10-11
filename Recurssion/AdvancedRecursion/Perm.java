package Recurssion.AdvancedRecursion;

public class Perm {
    public static void perm(String str, String st){
        if(str.length()==0){
            System.out.println(st);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            perm(newString, st+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}
