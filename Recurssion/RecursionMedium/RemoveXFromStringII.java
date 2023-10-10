package Recurssion.RecursionMedium;
import java.util.Scanner;
public class RemoveXFromStringII {


    public static String removeX(String str, int a, String stx, int b){
        if(a==str.length()){
            for(int i=0;i<b;i++){
                stx+='x';
            }
            return stx;
        }
        if(str.charAt(a)!='x')
            stx+=str.charAt(a);
        else
            b++;
        return removeX(str,a+1,stx,b);
    }

    public static void main(String[] args) {
        // Remove X using another string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        str = removeX(str,0,"",0);
        System.out.println(str);
        sc.close();
    }
}
