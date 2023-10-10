package Recurssion.AdvancedRecursion;

public class PermutationOfString {

    public static void permString(String str, String perm){
        if(str.length() == 0 ){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i+1);
            permString(str1,perm+curr);
        }
        
    }
    public static void main(String[] args) {
        String str ="abc";
        permString(str, "");
    }
}
