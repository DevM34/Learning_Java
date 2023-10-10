package Recurssion.RecursionMedium;

public class KeypadCombination {

    // Keypad Combination
    public static String map[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keypadComb(String str, int a, String comb){
        if(a==str.length()){
            System.out.println(comb);
            return;
        }

        for(int i =0;i<map[str.charAt(a)-'0'].length();i++){
            char ch = map[str.charAt(a)-'0'].charAt(i);
            keypadComb(str, a+1, comb+ch);
        }
    }



    public static void main(String[] args) {
        // Keypad Combination
        String str = "223";
        keypadComb(str, 0, "");
    }
    
}
