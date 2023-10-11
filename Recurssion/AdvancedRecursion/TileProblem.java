package Recurssion.AdvancedRecursion;

public class TileProblem {
    

   public static int tileCount(int n, int m){
    if(n==m)
        return 2;
    
    if(n<m)
        return 1;
    
    //horizontally
    int countHorizon = tileCount(n-1, m);

    //vertically 
    int countVertical = tileCount(n-m, m);

    return countHorizon + countVertical;
   } 
    public static void main(String[] args) {
        int n = 4, m = 2;
        int totalCount = tileCount(n,m);
        System.out.print(totalCount);
    }
}
