package Recurssion.AdvancedRecursion;
import java.util.ArrayList;
public class SubsetOfSet {

    public static void printSubset(ArrayList<Integer> set){
        for(int i=0;i<set.size();i++){
            System.out.print(set.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void subSet(int n, ArrayList<Integer> set){
        if(n==0){
            printSubset(set);
            return;
        }

        //Include
        set.add(n);
        subSet(n-1, set);

        //Does not include
        set.remove(set.size()-1);
        subSet(n-1, set);
    }

    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        int n = 3;
        subSet(n,set);
    }
}
